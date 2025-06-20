package strings;

public class recursive {
    // Recursive method to reverse a string
    public static String reverse(String str) {
        if(str.isEmpty()){
            return str;
        }
        // Recursive case: reverse the rest of the string and append the first character
        return reverse(str.substring(1)+ str.charAt(0));
    }

    public static void main(String[] args) {
        String input = "Hello world";
        String reversed = reverse(input);
        System.out.println("original string:" +input);
        System.out.println("Reversed string:" + reversed);
    }
}
