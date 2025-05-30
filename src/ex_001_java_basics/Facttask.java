package ex_001_java_basics;

import java.util.Scanner;

public class Facttask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        int fact = 1;
        if (num == 0){
            System.out.println("Factorial is " +fact);
        }
        else{
            for (int i = num; i >0; i--){
                fact = fact * i;

            }
            System.out.println("Factorial is " +fact);
        }

    }
}
