package Codingchallenge;

public class Equals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "java";

        // Using == operator (reference comparison)
        System.out.println("Using == :");
        System.out.println("str1 == str2: " + (str1 == str2));   // true (same object from string pool)
        System.out.println("str1 == str3: " + (str1 == str3));   // false (different objects)

        // Using equals() (content comparison)
        System.out.println("\nUsing equals() :");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

        // Using equalsIgnoreCase()
        System.out.println("\nUsing equalsIgnoreCase() :");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // Using compareTo() (lexicographical comparison)
        System.out.println("\nUsing compareTo() :");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0 (equal)
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative (uppercase < lowercase)

        // Using compareToIgnoreCase()
        System.out.println("\nUsing compareToIgnoreCase() :");
        System.out.println("str1.compareToIgnoreCase(str4): " + str1.compareToIgnoreCase(str4)); // 0
    }
}

