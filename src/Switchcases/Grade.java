package Switchcases;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade : ");
        String grade = sc.next();
        switch (grade) {
            case "A":
                System.out.println("Excellent student");
                break;
                case "B":
                    System.out.println("VeryGood");
                    break;
                    case "C":
                        System.out.println("Good");
                        break;
                        case "D":
                            System.out.println("Needimprovement");
                            break;
                            case "F":
                                System.out.println("Fail");
                                break;
                                default:
                                    System.out.println("Invalid grade");
        }
    }
}
