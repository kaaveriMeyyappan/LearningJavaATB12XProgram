package Array;

public class Sumnumbers {
    public static void main(String[] args) {
        int[] numbers = {2,6,67,40,25};
        int sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum = sum + numbers[i];

        }
        System.out.println(sum);
    }
}
