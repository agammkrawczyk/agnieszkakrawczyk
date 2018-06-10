package com.kodilla.testing.example;

import java.util.*;

public class Main {
    public static long getCountEmptyStringUsingJava7(List<String> strings) {
        long i = 0;
        for (String count : strings) {
            if (count.isEmpty()) i++;
        }
        return i;
    }

    public static long getCountLength3UsingJava7(List<String> strings) {
        long i = 0;
        for (String count : strings) {
            if (count.length() == 3) {
                i++;
            }
        }
        return i;
    }

    public static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> newList = new ArrayList<>();
        for (String count : strings) {
            if (count.length() > 0) {
                newList.add( count );
            }

        }
        return newList;
    }

    public static String getMergedStringUsingJava7(List<String> strings, String s) {
        List<String> newList = new ArrayList<>();
        String result = null;
        for (String count : strings) {
            if (count.length() > 0) {
                newList.add( count );
                result = String.join( ",", newList );
            }
        }
        return result;
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<>();
        Set<Integer> duplicated = new HashSet<Integer>();


        for (Integer a : numbers) {
            duplicated.add( a );
        }


        for (Integer n : duplicated) {
            squaresList.add( n * n );
        }
        return squaresList;


    }

    public static Integer getMax(List<Integer> numbers) {
        Integer max = Collections.max( numbers );

        return max;
    }

    public static Integer getMin(List<Integer> numbers) {
        Integer min = Collections.min( numbers );

        return min;
    }

    public static Integer getSum(List<Integer> numbers) {

        Integer sum = 0;
        for (Integer x : numbers) {
            sum += x;
        }
        return sum;
    }

    public static Integer getAverage(List<Integer> numbers) {

        Integer average;
        Integer sum = 0;
        for (Integer x : numbers) {
            sum += x;
        }

        average = sum / numbers.size();


        return average;

    }
}