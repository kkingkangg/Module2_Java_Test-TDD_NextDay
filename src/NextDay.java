import java.util.Scanner;

public class NextDay {

    public static int[] nextDay(int day, int month, int year) {
        int[] nextDay = new int[3];

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day >= 1 && day < 31)
                day++;
            else if (day == 31) {
                if (month < 12) {
                    day = 1;
                    month++;
                } else if (month == 12) {
                    day = 1;
                    month = 1;
                    year++;
                }
            }
        } else if (month == 2) {
            if (isLeapYear(year)) {
                if (day >= 1 && day <= 28) {
                    day++;
                } else if (day == 29) {
                    day = 1;
                    month++;
                }
            } else {
                if (day >= 1 && day <= 27) {
                    day++;
                } else if (day == 28) {
                    day = 1;
                    month++;
                }
            }
        } else {
            if (day >= 1 && day < 30)
                day++;
            else if (day == 30) {
                    day = 1;
                    month++;
            }
        }

        nextDay[0] = day;
        nextDay[1] = month;
        nextDay[2] = year;

        return nextDay;
    }

    public static boolean isLeapYear(int year) {
        boolean divisible4 = year % 4 == 0;
        boolean divisible100 = year % 100 == 0;
        boolean divisible400 = year % 400 == 0;
        if (!divisible4)
            return false;
        else {
            if (divisible100) {
                if (divisible400)
                    return true;
                return false;
            }
            return true;
        }

    }

}

