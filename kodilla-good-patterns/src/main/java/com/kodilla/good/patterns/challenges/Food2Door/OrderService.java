package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public interface OrderService {

       boolean process(String providerID, int price);
       List<Food>getFoodList();
       void orderListForClient();

}
