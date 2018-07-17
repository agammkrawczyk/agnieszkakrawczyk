package com.kodilla.good.patterns.challenges.CarService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CarRentalService  implements RentalService{
    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo){
        System.out.println( "Renting Car for" +user.getUserName()+ user.getUserSurname()+
                "from"+ carRentFrom.toString()+carRentTo.toString());
        return true;
    }
}
