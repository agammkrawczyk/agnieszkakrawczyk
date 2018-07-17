package com.kodilla.good.patterns.challenges.CarService;

import java.time.LocalDateTime;

public class RentRequestRetriever {
    public RentRequest retrieve(){
        User user= new User( "James","Bond" );
        LocalDateTime rentFrom= LocalDateTime.of( 2017,9, 4,10,2 );
        LocalDateTime rentTo= LocalDateTime.of(2017,9,5,10,5);
    return  new RentRequest(user, rentFrom,rentTo);
    }
}
