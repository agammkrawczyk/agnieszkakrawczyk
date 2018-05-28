package com.kodilla.testing.collection;
import com.kodilla.testing.collection.CollectionTestSuite;

import  org.junit.*;
import java.util.*;

import static org.junit.Assert.*;

public class CollectionTestSuite {
    //testing emptylist
    @Test
      public void testOddNumbersExterminatorEmptyList () {
        //Given
        List<Integer> theEmptyList = new ArrayList<Integer>();
        OddNumbersExterminator tester = new OddNumbersExterminator();

        //When
       List<Integer> result= tester.printEven(theEmptyList);
        //Then
        assertTrue(result.size() == 0);
    }
    //testing normal list
    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> actual = Arrays.asList(1,2,3,4);
        List<Integer> expected= Arrays.asList(2,4);

        OddNumbersExterminator tester = new OddNumbersExterminator();

        //When
        List<Integer> result=tester.printEven(actual);

        // Then
        assertEquals(expected, result);


    }


}
