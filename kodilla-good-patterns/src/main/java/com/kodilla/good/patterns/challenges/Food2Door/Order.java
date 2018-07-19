package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {
    private ProviderID providerID;
    private Food food;
    private int price;

    public Order(ProviderID providerID, Food food, int price) {
        this.providerID = providerID;
        this.food = food;
        this.price = price;
    }

    public ProviderID getProviderID() {
        return providerID;
    }

    public Food getFood() {
        return food;
    }

    public int getPrice() {
        return price;
    }
}
