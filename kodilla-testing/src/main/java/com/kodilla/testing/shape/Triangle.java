package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double height;
    double lenght;

    public Triangle(double height, double lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    public String getShapeName(){
        return "Triangle";

    }

    public double getField(){
        return 0.5*height*lenght;
    }
}
