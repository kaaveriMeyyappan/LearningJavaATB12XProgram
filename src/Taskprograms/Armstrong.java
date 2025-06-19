package Taskprograms;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scanner.nextInt();
        scanner.close();
        if (isArmstrong(number)){
            System.out.println(number + "is an armstrong number");
        }
        else{
            System.out.println(number + "is not an armstrong number");
        }
    }
public static boolean isArmstrong(int number){
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while(number > 0){
            int digit = number % 10;
            sum += Math.pow(digit,digits);
            number /= 10;
    }
    return sum == originalNumber;
    }
}
