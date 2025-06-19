package Array;

public class highest {
    public static void main(String[] args) {
        int[] numbers = {12,32,45,50,35};
        int highest = 0;
        int secondhighest = 0;
        for(int num:numbers){
            if(num>highest){
                secondhighest = highest;
                highest = num;
            } else if (num>secondhighest && num !=highest) {
                secondhighest = num;
            }
            System.out.println(secondhighest);
        }
    }
}
