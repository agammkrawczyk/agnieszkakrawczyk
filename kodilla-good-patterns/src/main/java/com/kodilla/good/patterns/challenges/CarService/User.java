package com.kodilla.good.patterns.challenges.CarService;

import java.time.LocalDateTime;

public class User {
    private String userName;
    private String userSurname;
    private LocalDateTime carRentFrom;
    private LocalDateTime carRentTo;

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public LocalDateTime getCarRentFrom() {
        return carRentFrom;
    }

    public LocalDateTime getCarRentTo() {
        return carRentTo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", carRentFrom=" + carRentFrom +
                ", carRentTo=" + carRentTo +
                '}';
    }
}
