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

            return new Dto( order.getProviderName(),true );}

            else {
            return  new Dto( order.getProviderName(),false );
        }


    }
}
