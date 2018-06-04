package com.kodilla.testing.shape;

public class Square implements Shape{
   double lenghtA;

    public Square(double lenghtA) {
        this.lenghtA = lenghtA;
    }

    public String getShapeName(){
        return " Square";
    }

     public double getField(){
         return lenghtA*lenghtA;
     }

}
