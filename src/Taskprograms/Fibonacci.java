package Taskprograms;

public class Fibonacci {
    public static void main(String[] args) {
            //number of terms in fibonacci series
            int n = 10;
            int first = 0,second = 1;
            System.out.println("fibonacci series up to "+ n+"terms:");
            for(int i =1; i<=n;i++){
                System.out.println(first + "");
                //calculate the next term
                int next = first + second;
                first=second;
                second=next;
            }
        }
    }


