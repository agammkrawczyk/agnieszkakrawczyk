package com.com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngredientsVegatablesDecorator extends AbstractPizzaOrderDecorator {
    public IngredientsVegatablesDecorator(PizzaOrder pizzaOrder) {
                super( pizzaOrder );
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add( new BigDecimal( 5 ) );
    }
    @Override
    public String getIngredients(){
        return  super.getIngredients()+"+oliwki, cebula, papryka";
    }
}
