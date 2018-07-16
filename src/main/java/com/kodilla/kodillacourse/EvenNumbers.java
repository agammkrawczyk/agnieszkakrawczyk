package com.kodilla.kodillacourse;

public class EvenNumbers {
    public static boolean isEvenNumber(int n) {

        if (n % 2 == 0) return true;
        else {
            return false;
        }

    }

    public static void main(String args[]) {
        int number = 2;
        int count = 0;
        while (count < 100) {
            if (isEvenNumber( number )) {
                count++;
                System.out.println( number );
            }
            number++;
        }
    }
}