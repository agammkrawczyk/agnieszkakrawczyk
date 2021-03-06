package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

   static double getAverage(int[] numbers){
     IntStream.range(0, numbers.length)
             .map(n -> numbers[n])
             .forEach(System.out::println);
     double theAverage = IntStream.range(0, numbers.length)
             .map(n -> numbers[n])
             .average()
             .getAsDouble();
     return theAverage;
  }


   static int getSum(int[]numbers) {
      IntStream.range( 0, numbers.length )
              .map( n -> numbers[n] )
              .forEach( System.out::println );
      int theSum = IntStream.range( 0, numbers.length )
              .map( n -> numbers[n] )
              .sum();
      return theSum;
   }


}


