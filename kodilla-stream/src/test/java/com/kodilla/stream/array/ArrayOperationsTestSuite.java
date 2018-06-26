package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;



import java.util.stream.IntStream;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //When
        double theAverage = ArrayOperations.getAverage( numbers );

        //Then
        Assert.assertEquals( 10.5, theAverage, 0.0 );
    }
    @Test
    public void testGetAverage2() {
        //Given
        int[] numbers = IntStream.range( 1, 21 ).toArray();
        //When
        double theAverage = ArrayOperations.getAverage( numbers );
        //Then
        Assert.assertEquals( 10.5, theAverage, 0.0 );
        System.out.println( theAverage );

    }
    @Test
    public void testGetSum() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5};

        //When
        int theSum = ArrayOperations.getSum( numbers );

        //Then
        Assert.assertEquals( 15, theSum, 0.0 );
    }



}