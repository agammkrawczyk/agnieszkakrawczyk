package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

import java.util.Map;

public class App {
    public void main(String args[]) {
        FoodOrderDawnload foodOrderDawnload = new FoodOrderDawnload();
        Order order = foodOrderDawnload.dawnload();


        Map<String, OrderService> selectProvider = new HashMap<String, OrderService>();

        selectProvider.put( "carrot", new GlutenFreeShop() );
        selectProvider.put( "apple", new ExtraFoodShop() );
        selectProvider.put( "orange", new GlutenFreeShop() );

        if (selectProvider.containsKey( order.getFood() ))

        {
            System.out.println( "Welcome in our shoping center. Your order is in " + order.getProviderName() );
        } else

        {
            System.out.println( "Ups... sorry... Please contatct with our  hotline for special order" );
        }

        ;
    }

}

