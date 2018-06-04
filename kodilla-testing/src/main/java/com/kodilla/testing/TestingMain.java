package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else System.out.println( "Error!" );


        // testing caclulator

        Calculator calculator= new Calculator();
        int  result1 = calculator.addAtoB(2,2);
        int result2= calculator.substractAfromB(10,5 );


        // testing add
        if(result1==(4) ){
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