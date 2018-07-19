package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public interface OrderService {

       boolean process(Food food);
       List<Food>getFoodList();
       void orderListForClient();

}
