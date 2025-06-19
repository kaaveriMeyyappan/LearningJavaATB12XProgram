package Taskprograms;

public class Letters {
    public static void main(String[] args) {
            String input = "Hello World"; // Example input
            input = input.toLowerCase(); // Convert to lowercase for uniformity

            int vowels = 0, consonants = 0;

            for (char ch : input.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
                    if ("aeiou".indexOf(ch) != -1)
                    {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }

