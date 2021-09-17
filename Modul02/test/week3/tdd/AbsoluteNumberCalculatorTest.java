package week3.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @org.junit.Test
    @Test
    @DisplayName("Test 0")
    public void findAbs0() {
        int a = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(a) ;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test 1")
    public void findAbs1() {
        int a = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(a) ;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test -1")
    public void findAbsMinus1() {
        int a = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(a) ;
        assertEquals(expected, result);
    }


}