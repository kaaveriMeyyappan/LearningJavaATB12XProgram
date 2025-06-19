package strings;

public class loopreverse {
    public static void main(String[] args) {
        String input = "MADAM";
        String output = null;
        for(int i= input.length()-1;i>=0;i--){
            output = output + input.charAt(i);
            System.out.println(input.charAt(i));
        }
        System.out.println(output);
        if( output == input){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
