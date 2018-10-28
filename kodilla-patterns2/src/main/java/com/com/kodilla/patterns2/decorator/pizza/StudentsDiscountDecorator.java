package com.com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class StudentsDiscountDecorator extends AbstractPizzaOrderDecorator{
    public StudentsDiscountDecorator(PizzaOrder pizzaOrder) {
        super( pizzaOrder );
    }

        @Override
        public BigDecimal getPrice () {
            return super.getPrice().subtract( new BigDecimal( 5 ) );
        }
        @Override
        public String getIngredients () {
            return super.getIngredients() + " extra student bonus";
        }
    }