package arraypack;

public class largestarray {
    public static void main(String[] args) {
        int[] array ={12,35,45,87,56};
        int max = array[0];//assume first element is largest
        for(int i =0;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The largest element in the array is:" +max);
    }
}
