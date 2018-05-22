package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator= new Calculator();
        int  result = calculator.addAtoB(2,2);
        int result2= calculator.substractAfromB(10,5 );


        // testing add
        if(result==(4) ){
            System.out.println("test add ok");
        }
        else {
        System.out.println("Erorr");
        }
//testing substract

        if ( result2==(5)) {
            System.out.println("test substract ok");
    }
        else {
        System.out.println("Erorr");
    }
    }
}