package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Dto {
    private List<Food> foodList;
    private ProviderID providerID;
    private boolean isOrder;

    public Dto(List<Food> foodList, ProviderID providerID, boolean isOrder) {
        this.foodList = foodList;
        this.providerID = providerID;
        this.isOrder = isOrder;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public ProviderID getProviderID() {
        return providerID;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
