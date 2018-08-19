package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext( BoardConfig.class );
        Board board = context.getBean( Board.class );

        //When
        board.getToDoList().add( "toDoAdd" );
        board.getInProgressList().add( "progressAdd" );
        board.getDoneList().add( "doneAdd" );

        //Then
        Assert.assertEquals( "toDoAdd", board.getToDoList().getTasks().get( 0 ) );
        Assert.assertEquals( "progressAdd", board.getInProgressList().getTasks().get( 0 ) );
        Assert.assertEquals( "doneAdd", board.getDoneList().getTasks().get( 0 ) );
    }
}