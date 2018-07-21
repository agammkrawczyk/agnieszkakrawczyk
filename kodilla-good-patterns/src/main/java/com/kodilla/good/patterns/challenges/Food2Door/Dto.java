package com.kodilla.good.patterns.challenges.Food2Door;

public class Dto {

    private String providerID;
    private boolean isOrder;

    public Dto(String providerID, boolean isOrder) {

        this.providerID = providerID;
        this.isOrder = isOrder;
    }


    public String getProviderID() {
        return providerID;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
