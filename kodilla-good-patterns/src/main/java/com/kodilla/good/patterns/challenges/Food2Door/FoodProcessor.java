package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodProcessor {
    private  OrderService orderService;

    public FoodProcessor(final OrderService orderService) {
        this.orderService = orderService;
    }
    public Dto process(final Order order){
        boolean isOrderedSth=orderService.process( order.getProviderID(),order.getPrice() );
        if (isOrderedSth){
            return new Dto( order.getProviderID(),true );}

            else {
            return  new Dto( order.getProviderID(),false );
        }
    }
}
