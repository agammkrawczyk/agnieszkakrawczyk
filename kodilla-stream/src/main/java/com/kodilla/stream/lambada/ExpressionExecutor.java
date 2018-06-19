package com.kodilla.stream.lambada;

public class ExpressionExecutor {
    public void executeExpresion(double a, double b, MathExpression mathExpression){
        double result= mathExpression.calculateExpression( a,b );
        System.out.println("Result equals:"+ result);
    }
}
