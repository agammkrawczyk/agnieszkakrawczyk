package com.kodilla.patterns2.decorator.pizza;

import com.com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
public class PizzaOrderTestSuit {
    @Test
    public void basicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder= new BasicPizzaOrder();
        //When
        BigDecimal price=theOrder.getPrice();
    //Then
        assertEquals( new BigDecimal(15),price );
    }

    @Test
    public void basicPizzaOrderGetIngredients(){
        //Given
        PizzaOrder theOrder= new BasicPizzaOrder();
        //When
       String type=theOrder.getIngredients();
       //Then
        assertEquals("basic(ciasto, sos pomidorowy, ser)",type );

    }
    @Test
    public void studentsDiscountGetPrice(){
        //Given
        PizzaOrder theOrder= new BasicPizzaOrder();
        theOrder=new StudentsDiscountDecorator( theOrder );
        //When
        BigDecimal price=theOrder.getPrice();
        //Then
        assertEquals( new BigDecimal( 10 ),price );
    }
@Test
    public void studnetsDiscountGetIngredients(){
        //Given
        PizzaOrder theOrder= new BasicPizzaOrder();
        theOrder= new StudentsDiscountDecorator( theOrder );
        //When
    String type= theOrder.getIngredients();
    //Then
    assertEquals("basic(ciasto, sos pomidorowy, ser) extra student bonus", type  );
}
@Test
    public void deliveryStudentPizzagetPrice(){
       //Given
        PizzaOrder theOrder= new BasicPizzaOrder();
        theOrder=new StudentsDiscountDecorator( theOrder );
        theOrder= new DeliveryDecorator( theOrder );
        //When
    BigDecimal price=theOrder.getPrice();
    //Then
    assertEquals( new BigDecimal( 15 ),price );

}
@Test
    public void deliveryStudentPizzaGetIngredients(){
        // //Given
            PizzaOrder theOrder= new BasicPizzaOrder();
            theOrder=new StudentsDiscountDecorator( theOrder );
            theOrder= new DeliveryDecorator( theOrder );
            //When
    String type=theOrder.getIngredients();
    //Then
    assertEquals( "basic(ciasto, sos pomidorowy, ser) extra student bonus+dowóz",type );
}
@Test
    public void meetVegatablesDeliveryPrice(){
      //Given
        PizzaOrder theOrder= new BasicPizzaOrder();
        theOrder=new IngredientsVegatablesDecorator( theOrder );
        theOrder=new IngredientsMeetDecorator( theOrder );
        theOrder= new DeliveryDecorator( theOrder );
        //When
    BigDecimal price=theOrder.getPrice();
    //Then
    assertEquals( new BigDecimal( 30 ),price );
}
@Test
    public void meetVegetablesDeliveryIngredients(){
        //Given
    PizzaOrder theOrder= new BasicPizzaOrder();
    theOrder=new IngredientsVegatablesDecorator( theOrder );
    theOrder=new IngredientsMeetDecorator( theOrder );
    theOrder= new DeliveryDecorator( theOrder );
    //When
    String type= theOrder.getIngredients();
//Then
    assertEquals( "basic(ciasto, sos pomidorowy, ser)+oliwki, cebula, papryka+szynka, boczek, salami+dowóz",type );

    }
}
