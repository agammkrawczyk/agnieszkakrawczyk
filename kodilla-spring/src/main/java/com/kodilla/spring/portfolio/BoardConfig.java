package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    TaskList toDoTaskList;

    @Autowired
    @Qualifier("progress")
    TaskList progrsTaskList;

    @Autowired
    @Qualifier("done")
    TaskList doneTaskList;

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();

    }

    @Bean(name = "progress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();

    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean
    public Board getBoard() {
        return new Board( toDoTaskList, progrsTaskList, doneTaskList );
    }
}
