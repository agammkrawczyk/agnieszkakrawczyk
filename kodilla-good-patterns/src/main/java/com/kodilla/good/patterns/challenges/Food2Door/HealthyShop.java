package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HealthyShop implements OrderService{

    public String getProviderName() {return "HealthyShop";};
    public String  getProviderLocation(){return "Radom";};

    @Override
    public boolean process(Food food) {
        System.out.println(" Welcome in HealthyShop");
        return true;
    }

    @Override
    public List<Food> getFoodList() {
        List<Food>healthyshopFoodList= new ArrayList<>(  );
        healthyshopFoodList.add(new Food( "carrot",1 )) ;
        healthyshopFoodList.add( new Food( "apple",1 ) );
        return healthyshopFoodList;
    }
    public void orderListForClient() {
  HealthyShop healthyShop= new HealthyShop();
    String healthyFood = healthyShop.getFoodList().stream()
            .map( Food::getFoodName )
            .collect( Collectors.joining( " helthy" , " helthy ","") );


        System.out.println("Your order in Helathy Shop. Only healthy products.. : "+ healthyFood);
}
}
