package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtraFoodShop implements OrderService {
    private static List<Food> extraFoodShopList = new ArrayList<>();

    static {
        extraFoodShopList.add( new Food( "water", 2 ) );
        extraFoodShopList.add( new Food( "salt", 3 ) );

    }

    public static Map<String, OrderService> getFoodOrder() {
        Map<String, OrderService> mapa = new HashMap<>();
        for (Food e : extraFoodShopList
                ) { mapa.put( e.getFoodName(),new ExtraFoodShop());

        } return mapa;
    }

    public boolean process(String providerID, int price) {
        System.out.println( "Welcome in ExtraFoodShop" );
        return true;
    }

    public List<Food> getFoodList() {


        return extraFoodShopList;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }

    public void orderListForClient() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        String beautyExtraFood = extraFoodShop.getFoodList().stream()
                .map( Food::getFoodName )
                .collect( Collectors.joining( " Extra ", " Extra ", "" ) );


        System.out.println( "Your order in ExtraFoodShop. Everything is extra ofc : " + beautyExtraFood );
    }
}

