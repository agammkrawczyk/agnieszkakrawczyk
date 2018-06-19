package com.kodilla.stream;
import com.kodilla.stream.lambada.ExpressionExecutor;


public class StreamMain {
    public static void main(String[]args){
       ExpressionExecutor expressionExecutor = new ExpressionExecutor();
       expressionExecutor.executeExpresion( 10,5,(a, b) -> a+b );
       expressionExecutor.executeExpresion( 10,5,(a, b) -> a-b );
       expressionExecutor.executeExpresion( 10,5,(a, b) -> a*b );
       expressionExecutor.executeExpresion( 10,5,(a, b) -> a/b );
    }
}
