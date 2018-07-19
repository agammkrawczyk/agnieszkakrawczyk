package com.kodilla.good.patterns.challenges.Food2Door;



public class Food {
    private String foodName;
    private int foodQuantity;

    public Food(String foodName, int foodQuantity) {
        this.foodName = foodName;
        this.foodQuantity = foodQuantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodQuantity=" + foodQuantity +
                '}';
    }
}

