package strings;

public class sequence {
    public static void main(String[] args) {
        CharSequence s ="kaaveri".subSequence(1,4);
        System.out.println(s);
        String a = "java".substring(2);
        System.out.println(a);
        String s1 = "java".substring(1,3);
        System.out.println(s1);
        char[] arr = "java".toCharArray();
        System.out.println(arr);
        String st = " Java ".trim();
        System.out.println(st);
        boolean b = "  ".isBlank();
        System.out.println(b);
        String s2 = "ab".repeat(3);
        System.out.println(s2);
        boolean b11 ="Java".equalsIgnoreCase("java");
        System.out.println(b11);
        String s111 = String.format("%s = %d","age",25);
        System.out.println(s111);
        long count = "a\nb\nc".lines().count();
        System.out.println(count);

    }
}
