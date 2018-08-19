package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun( "Sezam" )
                .burgers( 2 )
                .ingredient( "onion" )
                .ingredient( "chese" )
                .sauce( "1000 island" )
                .build();


        System.out.println( bigmac );
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals( 2, howManyIngredients );

    }

}