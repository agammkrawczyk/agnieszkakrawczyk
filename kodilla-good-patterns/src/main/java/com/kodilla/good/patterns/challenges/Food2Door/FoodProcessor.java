package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodProcessor {
    private  OrderService orderService;

    public FoodProcessor(final OrderService orderService) {
        this.orderService = orderService;
    }

    public FoodProcessor() {

    }

    public Dto process(final Order order){
        boolean isOrderedSth=orderService.process( order.getProviderName(),order.getPrice() );
        if (isOrderedSth){
           HealthyShop healthyShop= new HealthyShop();
           GlutenFreeShop glutenFreeShop= new GlutenFreeShop();
           ExtraFoodShop extraFoodShop= new ExtraFoodShop();

            Map<String,List<Food>>selectProvider= new HashMap(  );
            selectProvider.put( "HealthhyShop",healthyShop.getFoodList());
            selectProvider.put( "GlutenFreeShop",glutenFreeShop.getFoodList());
            selectProvider.put( "ExtraFoodShop" ,extraFoodShop.getFoodList());

            return new Dto( order.getProviderName(),true );}

            else {
            return  new Dto( order.getProviderID(),false );
        }


    }
}
