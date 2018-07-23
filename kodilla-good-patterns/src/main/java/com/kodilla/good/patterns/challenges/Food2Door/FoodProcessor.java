package com.kodilla.good.patterns.challenges.Food2Door;


import java.util.HashMap;
import java.util.Map;

public class FoodProcessor {
    private OrderService orderService;

    public FoodProcessor(final OrderService orderService) {
        this.orderService = orderService;
    }


    public Dto process(final Order order) {
        boolean isOrderedSth = orderService.process( order.getFood(), order.getPrice() );
        if (isOrderedSth) {

            System.out.println( "Welcome in our shoping center. ");

            Map<String, OrderService> selectProvider = new HashMap<String, OrderService>();

            selectProvider.put( "carrot", new GlutenFreeShop() );
            selectProvider.put( "apple", new ExtraFoodShop() );
            selectProvider.put( "orange", new GlutenFreeShop() );

            if (selectProvider.containsKey( order.getFood() ))

            orderService.process( order.getFood(), order.getPrice() );
            System.out.println( "The price is" + order.getPrice() + " Thank you" );

            System.out.println( "Your order was procesing by  " +selectProvider.get( order.getFood() ));
            System.out.println( "In this shop you can buy also" );
            orderService.orderListForClient();


            return new Dto( order.getFood(), true );
        } else

        {
            System.out.println( "Ups... sorry... Please contatct with our  hotline for special order" );

        }

        return new Dto( order.getFood(), false );


    }
}