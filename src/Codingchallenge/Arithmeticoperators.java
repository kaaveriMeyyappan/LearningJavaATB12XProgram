package Codingchallenge;

public class Arithmeticoperators {
    public static void main(String[] args) {
        // Declare and initialize variables
        int a = 10, b = 5;
        int result;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        result = a; // Assign
        System.out.println("Initial result: " + result);

        result += b; // Add and assign
        System.out.println("result += b: " + result);

        result -= b; // Subtract and assign
        System.out.println("result -= b: " + result);

        result *= b; // Multiply and assign
        System.out.println("result *= b: " + result);

        result /= b; // Divide and assign
        System.out.println("result /= b: " + result);

        result %= b; // Modulus and assign
        System.out.println("result %= b: " + result);
    }
}

