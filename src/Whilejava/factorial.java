package Whilejava;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the factorial program");
        System.out.println("Enter the number,whose factorial you want");
              if(!sc.hasNextInt()){
                  System.out.println("Enter the int,rerun the program");
        }
              int number = sc.nextInt();
              int factorial = 1;
              if(number == 0){
                  System.out.println("factorial is -> "+factorial);
              }
              int i =1;
              while(i <= number){
                  factorial = factorial * i;
                  i++;
              }
        System.out.println("factorial is -> "+factorial);
    }
}
