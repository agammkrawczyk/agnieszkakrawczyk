package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopingTask = taskFactory.makeTask( TaskFactory.SHOPPING );
        String shopping = shopingTask.executeTask();
        //Then
        Assert.assertEquals( "shopping", shopingTask.getTaskName() );
        Assert.assertEquals( true, shopingTask.isTaskExecuted() );


    }

    @Test
    public void testFactoryPainging() {
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask( TaskFactory.PAINTING );
        String painting = paintingTask.executeTask();
        // Then
        Assert.assertEquals( "renovation", paintingTask.getTaskName() );
        Assert.assertEquals( true, paintingTask.isTaskExecuted() );
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask( TaskFactory.DRIVING );
        String driving = drivingTask.executeTask();

        //Then
        Assert.assertEquals( "pickup", drivingTask.getTaskName() );
        Assert.assertEquals( true, drivingTask.isTaskExecuted() );

    }
}
