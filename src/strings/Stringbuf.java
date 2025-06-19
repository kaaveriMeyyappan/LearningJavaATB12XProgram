package strings;

public class Stringbuf {
    public static void main(String[] args) {
        StringBuffer StringBuffer = new StringBuffer("kaaveri");
        StringBuffer.append("Test");
        System.out.println(StringBuffer);
        String s1 = "kaaveri";
        s1 = s1+ "Test";
        System.out.println(s1);


    }
}