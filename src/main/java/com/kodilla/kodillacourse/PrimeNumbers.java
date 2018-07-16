package com.kodilla.kodillacourse;

public class PrimeNumbers {


    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;

        }
        return true;
    }


    public static void main(String args[]) {
        int number = 2;
        int count = 0;

        while (count < 1000) {
            if ((isPrime( number ))) {
                count++;
                System.out.println( number );
            }
            number++;
        }


    }
}