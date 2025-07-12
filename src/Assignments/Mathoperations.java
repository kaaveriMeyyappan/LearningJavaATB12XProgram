package Assignments;

public class Mathoperations {
    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Mathoperations math = new Mathoperations();
        int resulttwo = math.multiply(5,6);
        System.out.println("product of two numbers:"+ resulttwo);
        int resultthree = math.multiply(6,8,10);
        System.out.println("product of three numbers:"+ resultthree);
    }
}
