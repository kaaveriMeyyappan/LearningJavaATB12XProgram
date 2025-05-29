package Switchcases;

import java.util.Scanner;

public class breakstatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");
        int day = 1;
        if(scanner.hasNextInt()) {
            day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thurs");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("Enter number between 1 to 7");
            }
        }
         else{
            System.out.println("why you are you entering non int values");
        }
    }
}
