package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";
    private Task task;

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask( "shopping", "wine", 100.00 );
            case PAINTING:
                return new PaintingTask( "renovation", "blue", "walls" );
            case DRIVING:
                return new DrivingTask( "pickup", "central railway station", "car" );

            default:
                return null;
        }
    }
}