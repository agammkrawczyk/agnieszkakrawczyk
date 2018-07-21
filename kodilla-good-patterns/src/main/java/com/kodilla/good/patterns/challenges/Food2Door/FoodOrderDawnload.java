package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderDawnload {
    public Order dawnload(){
        ProviderID providerID= new ProviderID( "HealthyShop","Radom" );
        Food food= new Food( "carrot",1 );
        return  new Order("HelthyShop","carrot",100);
    }
}
