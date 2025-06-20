package arraypack;

public class smallest {
    public static void main(String[] args) {
        int[] arr = {5,45,65,35,20};
        // Assume the first element is the smallest

        int smallestarray = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<smallestarray){
                smallestarray = arr[i];// Update smallest if a smaller element is found
            }
        }
        System.out.println("The smallest element in the array is: " + smallestarray);

    }
}
