package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.decorator.taxiportal.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.* ;
public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
//When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals( new BigDecimal( 5 ), calculateCost );
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals( "Drive a course", description );
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator( theOrder );
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals( new BigDecimal( 40 ), theCost );
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator( theOrder );
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals( "Drive a course by Taxi Network", description );
    }
@Test
public void testUberGetDescriotion(){
        //Given
    TaxiOrder theOrder= new BasicTaxiOrder();
    theOrder=new UberNetworkOrderDecorator( theOrder );
    //When
    String description= theOrder.getDescription();
    //Then
    assertEquals("Drive a course by Uber Network",description   );
}
    @Test
    public void testTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator( theOrder );
        theOrder = new ChildSeatDecorator( theOrder );
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals( new BigDecimal( 37 ), theCost );


    }

    @Test
    public void testTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator( theOrder );
        theOrder = new ChildSeatDecorator( theOrder );
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals( "Drive a course by Taxi Network + child seat", description );

    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator( theOrder );
        theOrder = new ChildSeatDecorator( theOrder );
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals( new BigDecimal( 37 ), theCost );


    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator( theOrder );
        theOrder = new ChildSeatDecorator( theOrder );
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals( "Drive a course by MyTaxi Network + child seat", description );
    }

    @Test
    public void testUberTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator( theOrder );
        theOrder = new ChildSeatDecorator( theOrder );
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals( new BigDecimal( 27 ), theCost );

    }

    @Test
    public void testUberTaxiWithTwoChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator( theOrder );
        theOrder = new ChildSeatDecorator( theOrder );
        theOrder = new ChildSeatDecorator( theOrder );
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals( new BigDecimal( 29 ), theCost );

    }

    @Test
    public void testExpressMyTaxiTaxiGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator( theOrder );
        theOrder = new ExpressDecorator( theOrder );
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals( new BigDecimal( 40 ), theCost );


    }
    @Test
    public void testVipUberTaxiGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator( theOrder );
        theOrder = new VipDecorator( theOrder );
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals( "Drive a course by Uber Network Vip service", description );
    }
}