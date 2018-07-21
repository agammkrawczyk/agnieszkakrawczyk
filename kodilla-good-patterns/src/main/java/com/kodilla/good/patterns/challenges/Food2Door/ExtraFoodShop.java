package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraFoodShop implements OrderService {


    public boolean process(String providerID, int price) {
        System.out.println( "Welcome in ExtraFoodShop" );
        return true;
    }

    public List<Food> getFoodList() {
        List<Food> extraFoodShopList = new ArrayList<>();
        extraFoodShopList.add(new Food( "water",2 ));
        extraFoodShopList.add( new Food( "salt",3 ) );
        return extraFoodShopList;
    }

    public void orderListForClient() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        String beautyExtraFood = extraFoodShop.getFoodList().stream()
                .map( Food::getFoodName )
                .collect( Collectors.joining( " Extra ", " Extra ","" ) );


        System.out.println("Your order in ExtraFoodShop. Everything is extra ofc : "+ beautyExtraFood);
    }
}

