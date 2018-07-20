package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Dto {

    private ProviderID providerID;
    private boolean isOrder;

    public Dto( ProviderID providerID, boolean isOrder) {

        this.providerID = providerID;
        this.isOrder = isOrder;
    }


    public ProviderID getProviderID() {
        return providerID;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
