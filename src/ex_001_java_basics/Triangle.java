package ex_001_java_basics;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second side of the triangle: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third side of the triangle: ");
        int c = scanner.nextInt();
        //check if sides can form triangle using imequilatytheorem
        if(a+b>c&&a+c>b&&b+c>a) {
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        }
        scanner.close();
    }
}



