package Array;

public class Test {
    public static void main(String[] args) {
        int[] array = {25, 34, 12, 87, 56, 90, 54};
        int max_number = max_element_array(array);
        System.out.println("Max is ," + max_number);

    }

    static int max_element_array(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

}

