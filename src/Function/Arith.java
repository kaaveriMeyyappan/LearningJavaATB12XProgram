package Function;

import java.util.Scanner;

public class Arith {
    public static void main(String[] args) {
        //create a function of sum,sub,mul,div
        //with parameter a,b(take the parameter from the user)

        //Logic building
        //step 1 ->Inputs and outputs
        //a,b-int ->scanner
        //int ->variable result ->
        //step 2: Rough logic ->create functions
        //Function ->type 4th with return and with arguments/parameters
        //step 3: write the code and find and fix ->edge cases
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the num1 ");
        int b = readInt(scanner, "Enter the num2");
        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a,b);
        int result_div = div(a, b);
        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
    }
        static int readInt(Scanner scanner, String prompt) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Enter the int only");
                System.exit(0);
                return -1; // unreachable but required for compilation
            }
        }
        static int sum(int a,int b){
            return a+b;
        }
        static int sub(int a,int b){
            return a-b;
        }
        static int mul(int a,int b){
            return a*b;
        }
        static int div(int a, int b) throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("Divison by zero is not allowed");
            }
            return a%b;
        }
    }

