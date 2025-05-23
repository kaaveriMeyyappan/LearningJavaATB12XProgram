package Task_001_Java_Multiples;

public class compareage {
    public static void main(String[] args) {
        String input  = args[0];
        int age =Integer.parseInt(input);
        System.out.println(age);
        String result = (age<18)?"Minor":(age<65)?"Adult":"Seniorcitizen";
        System.out.println(result);
    }
}
