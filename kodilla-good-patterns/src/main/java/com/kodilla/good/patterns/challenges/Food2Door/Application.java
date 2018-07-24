package com.kodilla.good.patterns.challenges.Food2Door;



public class Application {


    public static void main(String args[]) {
        FoodOrderDawnload foodOrderDawnload = new FoodOrderDawnload();
        Order order = foodOrderDawnload.dawnload();
        FoodProcessor foodProcessor = new FoodProcessor();

        try {
            foodProcessor.process(order);
        } catch (ProcessingException e) {
            System.out.println( "There is no shop available to process this order. please wait.." );
        }


    }
}