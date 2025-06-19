package strings;

public class Stringbuffer {
    public static void main(String[] args) {
        String s0 = "kaaveri";
        String s1 = new String("kaaveri");
        StringBuffer StringBuffer = new StringBuffer("kaaveri");
        StringBuilder StringBuilder = new StringBuilder("kaaveri");
        System.out.println(StringBuffer);
        System.out.println(StringBuilder);
        System.out.println(StringBuffer.reverse());
        System.out.println(StringBuilder.reverse());
    }
}
