package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Order {
    private String providerName;
    private String food;
    private List<Food> FoodList;
    private int price;

    public Order( String providerName, String food, int price) {
        this.providerName = providerName;
        this.food = food;
        this.price = price;
    }

    public List<Food> getFoodList() {
        return FoodList;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getFood() {
        return food;
    }

    public int getPrice() {
        return price;
    }
}
