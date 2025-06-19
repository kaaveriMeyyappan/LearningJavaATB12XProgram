package Whilejava;

public class Userdefined {
    public static void main(String[] args) {
        int r1= sum_of_two_numbers(4,5);
        int r2= sum_of_two_numbers(12,8);
        System.out.println(r1);
        System.out.println(r2);
    }
    static int sum_of_two_numbers(int first,int second){
        return first+second;
    }
}
