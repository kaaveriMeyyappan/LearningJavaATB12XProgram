package Taskprograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            int reversed =0;
            while(number !=0){
                int digit = number%10;
                reversed = reversed *10+digit;
                number /= 10;
        }
            System.out.println("Reversed number:" + reversed);
    }
}
