package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HealthyShop implements OrderService{
    private static List<Food>healthyshopFoodList= new ArrayList<>(  );

    static {
        healthyshopFoodList.add(new Food( "carrot",1 )) ;
        healthyshopFoodList.add( new Food( "apple",1 ) );
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }

    public static Map<String, OrderService>getFoodOrder(){
        Map<String,OrderService>mapa= new HashMap<>(  ) ;
        for (Food e:healthyshopFoodList
             ) {
            mapa.put( e.getFoodName() ,new HealthyShop());
        }
        return mapa;
    }

    public String getProviderName() {return "HealthyShop";};
    public String  getProviderLocation(){return "Radom";};

    @Override
    public boolean process(String providerID, int price) {
        System.out.println(" Welcome in HealthyShop");
        return true;
    }

    @Override
    public List<Food> getFoodList() {


        return healthyshopFoodList;
    }

    public void orderListForClient() {
        HealthyShop healthyShop = new HealthyShop();
        String healthyFood = healthyShop.getFoodList().stream()
                .map( Food::getFoodName )
                .collect( Collectors.joining( " helthy", " helthy ", "" ) );


        System.out.println("Your order in Helathy Shop. Only healthy products.. : "+ healthyFood);
}
}
