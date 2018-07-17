package com.kodilla.good.patterns.challenges.DiamondStore;

public class Order {
    private User user;
    private Diamonds diamonds;
    private int price;


    public Order(User user, Diamonds diamonds) {
        this.user = user;
        this.diamonds = diamonds;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", diamonds=" + diamonds +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public Diamonds getDiamonds() {
        return diamonds;

    }
}
