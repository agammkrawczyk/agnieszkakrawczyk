package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Order {

    private String food;

    private int price;

    public Order(String food, int price) {
        this.food = food;
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public int getPrice() {
        return price;
    }
}
