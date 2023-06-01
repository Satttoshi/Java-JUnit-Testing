package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestMain {
    @Test
    void testAddition() {

        //Given
        int number1 = 2;
        int number2 = 3;

        //When
        int actual = Main.add(number1, number2);

        //Then
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsBiggerThanHundred() {

        //Given
        int number = 100;

        //When
        boolean actual = Main.isBiggerThanHundred(number);

        //Then
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFizzbuzz() {

        //Given
        int number = 15;

        //When
        String actual = Main.fizzbuzz(number);

        //Then
        String expected = "fizzbuzz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSmallerThanZero() {

            //Given
            int number = -1;

            //When
            boolean actual = Main.smallerThanZero(number);

            //Then
            boolean expected = true;
            Assertions.assertEquals(expected, actual);
    }
}
