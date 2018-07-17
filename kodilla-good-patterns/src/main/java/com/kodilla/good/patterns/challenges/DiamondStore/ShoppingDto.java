package com.kodilla.good.patterns.challenges.DiamondStore;


public class ShoppingDto {
    public User user;
    public boolean boughtSth;

    public ShoppingDto(User user, boolean boughtSth) {
        this.user = user;
        this.boughtSth = boughtSth;
    }

    public User getUser() {
        return user;
    }

    public boolean isBoughtSth() {
        return boughtSth;
    }
}
