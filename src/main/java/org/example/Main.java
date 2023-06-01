package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Add 2 numbers: " + add(1,2));
        System.out.println("Is bigger than 100?: " + isBiggerThanHundred(101));
        System.out.println("Fizzbuzz: " + fizzbuzz(7));
        System.out.println("Smaller than zero?: " + smallerThanZero(2));
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isBiggerThanHundred(int a) {
        return a > 100;
    }

    public static String fizzbuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else {
            return "buzz";
        }
    }

    public static boolean smallerThanZero(int number) {
        return number < 0;
    }

}