package Taskprograms;

public class example {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        // Compare characters while i < j
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Madam";
        str= str.toLowerCase();
        if (isPalindrome(str)){
            System.out.println(str +   "is palindrome");
        }
        else{
            System.out.println(str +  "It is not palindrome");
        }
    }
}
