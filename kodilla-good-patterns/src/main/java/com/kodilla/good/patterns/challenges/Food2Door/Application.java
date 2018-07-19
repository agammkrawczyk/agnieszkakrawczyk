package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String args []){
        HealthyShop healthyShop= new HealthyShop();
        healthyShop.orderListForClient();

        GlutenFreeShop glutenFreeShop= new GlutenFreeShop();
        glutenFreeShop.orderListForClient();

        ExtraFoodShop extraFoodShop= new ExtraFoodShop();
        extraFoodShop.orderListForClient();
}

}
