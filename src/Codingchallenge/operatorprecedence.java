package Codingchallenge;

public class operatorprecedence {
    public static void main(String[] args) {

                // Demonstrating Operator Precedence
                int result = 10 + 5 * 2; // Multiplication (*) has higher precedence than addition (+)
                System.out.println("Result without parentheses (10 + 5 * 2): " + result);

                result = (10 + 5) * 2; // Parentheses override precedence
                System.out.println("Result with parentheses ((10 + 5) * 2): " + result);

                // Demonstrating Type Casting
                int intVal = 10;
                double doubleVal = 3.5;

                // Implicit casting (widening conversion)
                double implicitCast = intVal; // int to double
                System.out.println("Implicit casting (int to double): " + implicitCast);

                // Explicit casting (narrowing conversion)
                int explicitCast = (int) doubleVal; // double to int
                System.out.println("Explicit casting (double to int): " + explicitCast);


            }
        }