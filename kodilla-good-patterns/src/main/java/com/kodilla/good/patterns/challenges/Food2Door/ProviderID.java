package com.kodilla.good.patterns.challenges.Food2Door;

public class ProviderID{
    private  String providerName;
    private String providerLocation;

    public ProviderID(String providerName, String providerLocation) {
        this.providerName = providerName;
        this.providerLocation = providerLocation;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProviderLocation() {
        return providerLocation;
    }

    @Override
    public String toString() {
        return "ProviderID{" +
                "providerName='" + providerName + '\'' +
                ", providerLocation='" + providerLocation + '\'' +
                '}';
    }
}
