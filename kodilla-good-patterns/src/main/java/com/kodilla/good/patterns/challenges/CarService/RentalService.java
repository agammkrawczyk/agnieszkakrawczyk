package com.kodilla.good.patterns.challenges.CarService;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(User user, LocalDateTime to, LocalDateTime from);
}
