package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
  @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME="IT course ";
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList= new TaskList( LISTNAME,"half year in It" );
        //When
        taskListDao.save( taskList );
        String listName=taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

       //Then
        Assert.assertEquals(2,readTaskList.size());
        //cleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);

   }
}
