package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.shape.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(Shape  shape){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle( 5.0 );
        // When
        shapeCollector.addFigure( circle );
        /* Then */
        Assert.assertEquals( 1, shapeCollector.checkingListSize() );
    }

    @Test
    public void testRemoveFigure(Shape shape) {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square( 4.0 );
        shapeCollector.addFigure( square );
        shapeCollector.addFigure( square );

        //When
        shapeCollector.removeFigure( square );
        //Then
        Assert.assertTrue(shapeCollector.checkingListSize()==1 );
    }

    @Test

    public void testGetFigure(int n) {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square( 5.0 );

        //When
        for (int i = 0; i < 10; i++) {
            shapeCollector.addFigure( square );
        }

        //Then
        Assert.assertEquals( square, shapeCollector.getFigure( 1 ) );
    }

}
