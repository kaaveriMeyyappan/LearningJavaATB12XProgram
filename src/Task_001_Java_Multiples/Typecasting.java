package Task_001_Java_Multiples;

public class Typecasting {
    public static void main(String[] args) {
        byte b =10;
        int a = b;
        int a1 = (int)b;
        System.out.println(a);
         int val = 300;
         byte b1 = (byte) val;
         System.out.println(b1);
         long phoneno = 9784289232l;
         short s = (short)phoneno;
         System.out.println(s);
         int course = 100;
         float GST = 18.5f;
         int total = course+(int)GST;
         System.out.println(total);
         float total2 = course + GST;
         System.out.println(total2);

    }
}
