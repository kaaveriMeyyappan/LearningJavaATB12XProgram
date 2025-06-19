package strings;

public class examp2 {
    public static void main(String[] args) {
        String name = "kaaveri";
        name = name.toUpperCase();
        System.out.println(name);
        String s = "JAVA";
        char c =s.charAt(2);
        System.out.println(c);
        System.out.println(s.codePointAt(2));
        int result = "abc".compareTo("ABC");
        int result2 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result);
        System.out.println(result2);
        int index = "java".indexOf("a");
        System.out.println(index);
        boolean b = "".isEmpty();
        System.out.println(b);
        String s11 = String.join(",","java","python");
        System.out.println(s11);
        String s12 = "Java".replace('a','o');
        System.out.println(s12);
        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);
    }
}
