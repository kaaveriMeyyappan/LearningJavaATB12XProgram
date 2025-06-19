package Function;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //user defined functions


        //1.without parameter and without Return type
        greeting();
        //2.without parameter and with Return type
        String msg =result();
        System.out.println(msg);
        //3.with parameter and without Return type
        resultreports("kaaveri",65,50000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter salary");
        double salary = scanner.nextDouble();
        //4.with paramaters and with Return type
        int sum = sum_of_twonumbers(2,4);
        int sum1 = sum_of_three_numbers(6,8,10);
        float res = sum_of_three_numbers(3.12f,4.12f,7.10f);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(res);

    }
     //1.without parameter and without Return type
    static void greeting(){
        System.out.println("HI how are you");
    }
    //2.without parameter and with Return type
    static String result(){
        System.out.println("Hi");
        return "outputstring";
    }
    //3.with parameter and without Return type
    static void resultreports(String name, int age,double salary ){
        System.out.println("your name is ->"+name+"\nyour age is" +age+"\nyoursalary is"+salary );
    }
    //4.with paramaters and with Return type
    static int sum_of_twonumbers (int a,int b){
        return a+b;

    }
    static int sum_of_three_numbers(int a,int b,int c){
        return a+b+c;
    }
    static float sum_of_three_numbers(float a,float b,float c){
        return a+b+c;
    }

}
