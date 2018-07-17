package com.kodilla.good.patterns.challenges.DiamondStore;


public class Applicaton {

    public static void main(String args[]) {
        ShoppingOrderDownload shoppingOrderDownload = new ShoppingOrderDownload();
        Order order = shoppingOrderDownload.download();
        ShoppingProcessor shoppingProcessor = new ShoppingProcessor( new Mailing(), new DiamondShoppingRepository(),
                new DiamondShoppingService() );
        shoppingProcessor.process( order );


    }
}