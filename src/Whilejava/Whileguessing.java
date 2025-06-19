package Whilejava;

import java.util.Random;
import java.util.Scanner;

public class Whileguessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int randtoguess = rand.nextInt(100)+1;
        System.out.println(randtoguess);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int guess;
        int attempts = 0;
        while (true) {
            if(!sc.hasNextInt()) {
                System.out.println("Please enter a number between 1 and 100 ");
                sc.nextInt();
                continue;
            }
            guess = sc.nextInt();
            attempts++;
            if(guess < 1 || guess > 100){
                System.out.println("Invalid number: ");
                continue;
            }
            if (guess < randtoguess) {
                System.out.println("too low.try again");
            }else if (guess > randtoguess) {
                System.out.println("too high.try again");

            }
            else {
                System.out.println("correct answer! you guessed it in " +attempts+ "attempts");
                break;
            }

        }


    }
}
