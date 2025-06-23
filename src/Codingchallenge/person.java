package Codingchallenge;

public class person {
        String name;
        int age;
    public static void main(String[] args) {
        // Create two instances of Person
        person person1 = new person("John", 25);
        person person2 = new person("Alice", 30);

        // Print their details
        person1.displayDetails();
        person2.displayDetails();
    }



    // Constructor to initialize the attributes
        person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display details
        void displayDetails() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Main class to test the Person class



