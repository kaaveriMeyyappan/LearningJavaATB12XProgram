package Taskprograms;

public class stringrev {
    public static void main(String[] args) {
        String original = "Hello world";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: "+reversed);
    }
}
