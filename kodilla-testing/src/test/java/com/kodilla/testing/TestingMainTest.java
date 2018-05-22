package com.kodilla.testing;

import static org.junit.Assert.*;
import com.kodilla.testing.calculator.Calculator

public class TestingMainTest {
{
        public static void main(String[] args){

            Calculator calculator= new Calculator();
            Double result= calculator.addAtoB(2,2);


            if (result.equals(4)) {
                System.out.println("test ok");
            }
            else {
                System.out.println("Erorr");
            }
}