package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GlutenFreeShop implements OrderService {

    public String getProviderName() {return "GlutenFreeShop";};
    public String  getProviderLocation(){return "Piaseczno";};

    @Override
    public boolean process(String providerID, int price) {System.out.println( "Welcome in GlutenFreeShop" );
        return true;
    }

    @Override
    public List<Food> getFoodList() {
        List<Food>glutenFreeShopList= new ArrayList<>(  );
        glutenFreeShopList.add( new Food( "carrot",1) );
        glutenFreeShopList.add(new Food( "bread",1 ));
        return glutenFreeShopList;
    }

    public void orderListForClient() {
       GlutenFreeShop glutenFreeShop= new GlutenFreeShop();
        String glutenFreeFood = glutenFreeShop.getFoodList().stream()
                .map( Food::getFoodName )
                .collect( Collectors.joining( " NO GLUTEN "," NO GLUTEN ","" ) );


        System.out.println("Your order in GlutenFreeShop. Gluten is a silent killer.. : "+ glutenFreeFood);
    }
}

