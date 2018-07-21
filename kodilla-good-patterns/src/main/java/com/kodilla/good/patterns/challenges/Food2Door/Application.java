package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {


    public static void main(String args[]) {
        FoodOrderDawnload foodOrderDawnload = new FoodOrderDawnload();
        Order order = foodOrderDawnload.dawnload();
        FoodProcessor foodProcessor = new FoodProcessor();
        foodProcessor.process( order );
    }
}