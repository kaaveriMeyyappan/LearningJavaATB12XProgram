package polymorphism;

public class mainoverloading {
    public static void main(String[] args) {
        overloading l1 =new overloading();
        int r = l1.add(3,4);
        System.out.println(r);
        int r1 = l1.add(4,5,6);
        System.out.println(r1);
        double r2 = l1.add(6.2,3.2);
        System.out.println(r2);

    }
}
