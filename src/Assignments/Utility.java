package Assignments;

public class Utility {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Utility util = new Utility();

        // Testing two integers
        System.out.println("Max of 10 and 20: " + util.max(10, 20));

        // Testing three integers
        System.out.println("Max of 3, 7, and 5: " + util.max(3, 7, 5));

        // Testing two doubles
        System.out.println("Max of 4.5 and 2.8: " + util.max(4.5, 2.8));
    }
}

