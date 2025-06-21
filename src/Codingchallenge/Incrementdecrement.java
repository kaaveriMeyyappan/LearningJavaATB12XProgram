package Codingchallenge;

public class Incrementdecrement {
    public static void main(String[] args) {
            int number = 5;

            // Post-increment
            System.out.println("Post-increment:");
            System.out.println("Before increment: " + number);
            System.out.println("Using number++: " + (number++));
            System.out.println("After increment: " + number);

            // Pre-increment
            System.out.println("\nPre-increment:");
            System.out.println("Before increment: " + number);
            System.out.println("Using ++number: " + (++number));
            System.out.println("After increment: " + number);

            // Post-decrement
            System.out.println("\nPost-decrement:");
            System.out.println("Before decrement: " + number);
            System.out.println("Using number--: " + (number--));
            System.out.println("After decrement: " + number);

            // Pre-decrement
            System.out.println("\nPre-decrement:");
            System.out.println("Before decrement: " + number);
            System.out.println("Using --number: " + (--number));
            System.out.println("After decrement: " + number);
        }
    }

