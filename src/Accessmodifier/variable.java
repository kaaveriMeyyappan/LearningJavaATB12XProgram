package Accessmodifier;

public class variable {

        int value = 10;
    }

    class small extends variable {
        int value = 20;

        void printValues() {
            System.out.println("Child value: " + value); // this refers to Child's value
            System.out.println("Parent value: " + super.value); // this refers to Parent's value
        }
    }

