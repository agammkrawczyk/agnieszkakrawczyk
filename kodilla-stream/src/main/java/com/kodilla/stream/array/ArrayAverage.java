package com.kodilla.stream.array;


import java.util.stream.IntStream;

public class ArrayAverage implements ArrayOperations {



    public  double   getAverage(int[] numbers){
       IntStream.range(0, numbers.length)
              .map(n -> numbers[n])
              .forEach(System.out::println);
       double theAverage = IntStream.range(0, numbers.length)
               .map(n -> numbers[n])
               .average()
               .getAsDouble();;
        return theAverage;
   }

}
