package com.kodilla.kodillacourse;

public class OddNumbers {
    public static boolean isOddNumber(int n) {

        if (n % 2 != 0) return true;
        else {
            return false;
        }

    }

    public static void main(String args[]) {
        int number = 2;
        int count = 0;
        while (count < 100) {
            if (isOddNumber( number )) {
                count++;
                System.out.println( number );
            }
            number++;
        }
    }

}

