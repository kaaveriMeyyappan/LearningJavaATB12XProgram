package arraypack;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] array = {1,5,7,8,9,45};
        System.out.println("original array:"+ Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed array:"+Arrays.toString(array));
    }

    public static void reverseArray(int[]array){
        int start = 0; int end = array.length-1;
        while(start < end){
            //swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
