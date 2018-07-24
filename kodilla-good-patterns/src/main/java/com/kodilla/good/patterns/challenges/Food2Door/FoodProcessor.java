package com.kodilla.good.patterns.challenges.Food2Door;


import java.util.HashMap;
import java.util.Map;

public class FoodProcessor {


    private static Map<String, OrderService> selectProvider = new HashMap<String, OrderService>();

    static {

        selectProvider.putAll( ExtraFoodShop.getFoodOrder() );
        selectProvider.putAll( HealthyShop.getFoodOrder() );
        selectProvider.putAll( GlutenFreeShop.getFoodOrder() );
    }


    public Dto process(final Order order) throws ProcessingException {

        OrderService orderService = null;

        if (selectProvider.containsKey( order.getFood() )) {
            orderService = selectProvider.get( order.getFood() );

        } else {
            throw new ProcessingException();
        }
        boolean isOrderedSth = orderService.process( order.getFood(), order.getPrice() );
        if (isOrderedSth) {

            System.out.println( "Welcome in our shoping center. " );


            orderService.process( order.getFood(), order.getPrice() );
            System.out.println( "The price is" + order.getPrice() + " Thank you" );

            System.out.println( "Your order was procesing by  " + selectProvider.get( order.getFood() ) );


            System.out.print( "In this shop you can buy also " );
            orderService.orderListForClient();


            return new Dto( order.getFood(), true );
        } else

        {
            System.out.println( "Ups... sorry... Please contatct with our  hotline for special order" );

        }

        return new Dto( order.getFood(), false );


    }
}