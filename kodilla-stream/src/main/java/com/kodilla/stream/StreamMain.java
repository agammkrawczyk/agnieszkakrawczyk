package com.kodilla.stream;
import com.kodilla.stream.lambada.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[]args){
       ExpressionExecutor expressionExecutor = new ExpressionExecutor();
       expressionExecutor.executeExpresion( 10,5,(a, b) -> a-b );
       expressionExecutor.executeExpresion( 10,5,(a, b) -> a*b );
       expressionExecutor.executeExpresion( 10,5,(a, b) -> a/b );

       System.out.println("Calculating expressions with method references");
       expressionExecutor.executeExpresion( 3,4,FunctionalCalculator::multiplyAByB);
       expressionExecutor.executeExpresion( 3,4,FunctionalCalculator::addAToB );
       expressionExecutor.executeExpresion( 3,4,FunctionalCalculator::subBFromA );
       expressionExecutor.executeExpresion( 3,4,FunctionalCalculator::divideAByB );
    }
}
