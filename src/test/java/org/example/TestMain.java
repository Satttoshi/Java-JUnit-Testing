package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestMain {
    @Test
    void test() {
        int number1 = 2;
        int number2 = 3;
        int actual = Main.add(number1, number2);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
