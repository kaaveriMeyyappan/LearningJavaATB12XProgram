package Codingchallenge;


    public class Student {
        // Attributes
        private String name;
        private int rollNo;
        private String section;
        public static void main(String[] args) {
            // Creating a Student object
            Student student = new Student("BOB", 101, "A");

            // Printing student details
            student.printDetails();
        }

        // Constructor
        public Student(String name, int rollNo, String section) {
            this.name = name;
            this.rollNo = rollNo;
            this.section = section;
        }

        // Method to print student details
        public void printDetails() {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Section: " + section);
        }


    }

