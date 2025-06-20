package arraypack;

import java.util.ArrayList;
import java.util.List;

public class oddeven {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer>oddnumbers = new ArrayList<>();
        List<Integer>evennumbers = new ArrayList<>();
        for(int num:numbers){
            if(num % 2 ==0){
                evennumbers.add(num);
            }else{
                oddnumbers.add(num);
            }
            System.out.println("Even numbers is"+evennumbers);
            System.out.println("Even numbers is"+oddnumbers);
        }
    }
}
