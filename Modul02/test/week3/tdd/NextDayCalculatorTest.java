package week3.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @org.junit.Test
    @Test
    @DisplayName("1-1-2018")
    public void nextDay112018(){
        int day = 1 ;
        int month = 1 ;
        int year = 2018 ;
    String expected = "2-1-2018" ;
    String result =  NextDayCalculator.nextDay(1,1,2018);
    assertEquals(expected,result) ;
    }

    @Test
    @DisplayName("31-1-2018")
    public void nextDay3112018(){
        int day = 31 ;
        int month = 1 ;
        int year = 2018 ;
        String expected = "1-2-2018" ;
        String result =  NextDayCalculator.nextDay(31,1,2018);
        assertEquals(expected,result) ;
    }

    @Test
    @DisplayName("28-2-2018")
    public void nextDay2822018(){
        int day = 28 ;
        int month = 2 ;
        int year = 2018 ;
        String expected = "1-3-2018";
        String result =  NextDayCalculator.nextDay(28,2,2018);
        assertEquals(expected,result) ;
    }

    @Test
    @DisplayName("28-2-2020")
    public void nextDay2822020(){
        int day = 28 ;
        int month = 2 ;
        int year = 2020 ;
        String expected = "29-2-2020";
        String result =  NextDayCalculator.nextDay(28,2,2020);
        assertEquals(expected,result) ;
    }

    @Test
    @DisplayName("31-12-2018")
    public void nextDay31122018(){
        int day = 31 ;
        int month = 12 ;
        int year = 2018 ;
        String expected = "1-1-2019";
        String result =  NextDayCalculator.nextDay(31,12,2018);
        assertEquals(expected,result) ;
    }

    @Test
    @DisplayName("30-4-2018")
    public void nextDay3042018(){
        int day = 30 ;
        int month = 4 ;
        int year = 2018 ;
        String expected = "1-5-2018";
        String result =  NextDayCalculator.nextDay(30,4,2018);
        assertEquals(expected,result) ;
    }


}