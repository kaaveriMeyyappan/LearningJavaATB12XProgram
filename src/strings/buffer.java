package strings;

public class buffer {
    public static void main(String[] args) {
        String original = "Hello,world";
        StringBuilder stringBuilder = new StringBuilder(original);
        //StringBuilder.append(123);
        String reverse = stringBuilder.reverse().toString();
        System.out.println("original string:" + original);
        System.out.println("Reversed string:" + reverse);
    }
}
