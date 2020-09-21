import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    void testNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int nextDay = 2;
        int[] expected = {nextDay, month, year};
        int[] result = NextDay.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int nextDay = 1;
        int nextMonth = 2;
        int[] expected = {nextDay, nextMonth, year};
        int[] result = NextDay.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;

        int nextDay = 1;
        int nextMonth = 5;
        int[] expected = {nextDay, nextMonth, year};
        int[] result = NextDay.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;

        int nextDay = 1;
        int nextMonth = 3;
        int[] expected = {nextDay, nextMonth, year};
        int[] result = NextDay.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int nextDay = 1;
        int nextMonth = 3;
        int[] expected = {nextDay, nextMonth, year};
        int[] result = NextDay.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;

        int nextDay = 1;
        int nextMonth = 1;
        int nextYear = 2019;
        int[] expected = {nextDay, nextMonth, nextYear};
        int[] result = NextDay.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

}