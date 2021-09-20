package week3.clean_code_and_refactoring.caculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week3.tdd.SimpleCalculator;


import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
//    @org.junit.Test
    @Test
    @DisplayName("Testing add 0 + 0")
    public void add0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void add1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void add0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @org.junit.Test
    @Test
    @DisplayName("Testing add 0 + 0")
    public void add5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void sub0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 1 - 0")
    public void sub1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 1")
    public void sub0And1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 5 - 3")
    public void sub5And3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}
