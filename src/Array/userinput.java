package Array;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array(int)");
        int size = scanner.nextInt();
        String[] number_marks = new String[size];
        for(int i = 0;i< number_marks.length;i++) {
            System.out.println("Enter the elements");
            number_marks[i] = scanner.next();
        }
        System.out.println("--print the values--");
            for(String marks : number_marks){
                System.out.println(marks);
            }

    }
}
