package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test

    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
    //When
    double addResult=calculator.add( 2.0,3.0 );
    double subResult=calculator.sub( 3.1,2.0 );
    double mulResult=calculator.mul( 10.0,5.0 );
    double divResult=calculator.div( 4.0,2.0 );
    //Then
        Assert.assertEquals(addResult,5.0,0.01);
        Assert.assertEquals( subResult,1.1, 0.01 );
        Assert.assertEquals( mulResult,50.0, 0.01 );
        Assert.assertEquals( divResult,2.0, 0.01 );
    }
}
