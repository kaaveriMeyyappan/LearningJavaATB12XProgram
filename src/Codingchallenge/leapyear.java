package Codingchallenge;

public class leapyear {
    public static void main(String[] args) {
            int year = 1900; // Replace with the year you want to check

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        public static boolean isLeapYear(int year) {
            // A year is a leap year if:
            // 1. It is divisible by 4, and
            // 2. It is not divisible by 100, unless it is also divisible by 400
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

