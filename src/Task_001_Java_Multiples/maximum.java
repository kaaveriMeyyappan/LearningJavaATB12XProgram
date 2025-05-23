package Task_001_Java_Multiples;

public class maximum {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int n3 = 2;
        int max = (n1>n2)?(n1>n3)? n1:n3:((n2>n3)? n2:n3);
        System.out.println(max);
    }
}
