package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory= new TaskFactory();
        //When
        Task shopingTask=taskFactory.makeTask( TaskFactory.SHOPPING );
        //Then
        Assert.assertEquals("shopping" ,shopingTask.getTaskName() );


    }
        @Test
        public void testFactoryPainging(){
        TaskFactory taskFactory= new TaskFactory();
        //When
        Task paintingTask=taskFactory.makeTask( TaskFactory.PAINTING );
        // Then
        Assert.assertEquals( "renovation",paintingTask.getTaskName() );
    }

    @Test
    public  void testFactoryDriving(){
        //Given
        TaskFactory taskFactory= new TaskFactory();
       //When
        Task drivingTask= taskFactory.makeTask( TaskFactory.DRIVING );
        //Then
        Assert.assertEquals( "pickup",drivingTask.getTaskName() );

    }
}
