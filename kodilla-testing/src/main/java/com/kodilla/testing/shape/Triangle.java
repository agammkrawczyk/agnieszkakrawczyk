package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double height;
    double lenght;

    public Triangle(double height, double lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    public String getShapeName(){
        return null;
        // return null temporrary
    };

    public double getField(){
        return 10;
        // return 10 temporrary
    };
}
