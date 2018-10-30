package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue studentA = new StudentATaskQueue("Agnieszka");
        TaskQueue studentB = new StudentBTaskQueue("Basia");

        Mentor mentor1 = new Mentor( "Pawel" );
        Mentor mentor2 = new Mentor( "Maciej" );
        studentA.registerObserver( mentor1 );
        studentB.registerObserver( mentor2 );
        //When
        studentA.addTask( "task 1" );
        studentA.addTask( "task 2" );
        studentB.addTask( "task1" );
        //Then
        assertEquals( 2, mentor1.getCounter() );
        assertEquals( 1, mentor2.getCounter() );

    }
}