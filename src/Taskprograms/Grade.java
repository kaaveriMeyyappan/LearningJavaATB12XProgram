package Taskprograms;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        // Store marks of all the subjects in an array
        int marks[] = new int[6];
        int i;
        float total = 0;
        float avg;
        //avg;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 6; i++) {
            System.out.print("Enter the marks of subject" +  (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        //calculate average
        avg = total / 6;
        System.out.print("The student Grade is: ");
        if (avg >= 90 && avg<= 100) {
            System.out.println("A");
        }
        else if (avg >= 80 && avg <= 89) {
            System.out.println("B");
        } else if (avg >= 70 && avg <= 79) {
            System.out.println("C");
        } else if (avg >= 60 && avg <= 69) {
            System.out.println("D");
        } else if (avg >= 0 && avg <= 59) {
            System.out.println("F");
        }
    }
}