package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GlutenFreeShop implements OrderService {
    private static List<Food> glutenFreeShopList = new ArrayList<>();

    static {
        glutenFreeShopList.add( new Food( "carrot", 1 ) );
        glutenFreeShopList.add( new Food( "bread", 1 ) );
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }

    public static Map<String, OrderService> getFoodOrder() {
        Map<String, OrderService> mapa = new HashMap<>();
        for (Food e : glutenFreeShopList
                ) {
            mapa.put( e.getFoodName(), new GlutenFreeShop() );
        }
        return mapa;
    }

    public String getProviderName() {
        return "GlutenFreeShop";
    }

    ;

    public String getProviderLocation() {
        return "Piaseczno";
    }

    ;

    @Override
    public boolean process(String providerID, int price) {
        System.out.println( "Welcome in GlutenFreeShop" );
        return true;
    }

    @Override
    public List<Food> getFoodList() {

        return glutenFreeShopList;
    }

    public void orderListForClient() {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        String glutenFreeFood = glutenFreeShop.getFoodList().stream()
                .map( Food::getFoodName )
                .collect( Collectors.joining( " NO GLUTEN ", " NO GLUTEN ", "" ) );


        System.out.println( "Your order in GlutenFreeShop. Gluten is a silent killer.. : " + glutenFreeFood );
    }
}

