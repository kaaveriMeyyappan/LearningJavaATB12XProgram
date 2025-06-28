package Codingchallenge;

public class Stringmanipulation {

        public static void main(String[] args) {
            // 1. String concatenation
            String greeting = "Hello";
            String name = "World";
            String fullMessage = greeting + ", " + name + "!";
            System.out.println("Concatenated String: " + fullMessage);

            // 2. String length
            int length = fullMessage.length();
            System.out.println("Length of the String: " + length);

            // 3. Substring extraction
            String sub = fullMessage.substring(7, 12); // Extracts "Alice"
            System.out.println("Extracted Substring: " + sub);

            // 4. Character extraction
            char letter = fullMessage.charAt(1); // Gets 'e' from "Hello"
            System.out.println("Character at index 1: " + letter);
        }
    }


