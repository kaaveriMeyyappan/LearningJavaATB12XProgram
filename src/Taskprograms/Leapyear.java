package Taskprograms;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year= scanner.nextInt();
        // Check if the year is a leap year
        if((year % 4 ==0 && year % 100 !=0)||(year % 400 ==0)){
            System.out.println(year + "is leap year");
        }
        else{
            System.out.println(year + "is not a leap year");
        }
    }

}
