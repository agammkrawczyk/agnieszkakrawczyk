package com.kodilla.good.patterns.challenges.DiamondStore;

public class ShoppingOrderDownload {
    public Order download(){
        User user= new User( "Marilyn","Monroe" );
        Diamonds diamonds= new Diamonds( 5,10000 );
        return  new Order( user,diamonds );



    }
}
