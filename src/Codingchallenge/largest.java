package Codingchallenge;

public class largest {
    public static void main(String[] args) {
            int num1 = 15, num2 = 27, num3 = 19;

            int largest = (num1 > num2)
                    ? (num1 > num3 ? num1 : num3)
                    : (num2 > num3 ? num2 : num3);

            System.out.println("The largest number is: " + largest);
        }
    }


