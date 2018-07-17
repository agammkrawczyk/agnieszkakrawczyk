package com.kodilla.good.patterns.challenges.DiamondStore;

public class Mailing implements InformationSystem {
    public void sendMessage(User user){

        System.out.println( "Dear " + user.getUserName() +"thank you for using our shop" );

    }
}
