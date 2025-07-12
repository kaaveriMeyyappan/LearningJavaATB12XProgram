package Assignments;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int intresult = calc.add(10,20);
        System.out.println("sum of integers:"+intresult);
        double doubleresult = calc.add(3.25,6.5);
        System.out.println("sum of double:"+doubleresult);
    }
}
