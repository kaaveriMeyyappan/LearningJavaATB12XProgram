package Abstract;

public class Example2 {
    public static void main(String[] args) {
        ABC kaaveri = new ABC(993678,"kaaveri");
        ABC priya = new ABC(99333,"priya");
        System.out.println(kaaveri.phone_np);
        System.out.println(priya.name);
        System.out.println(ABC.course_name);
        ABC.m1();
    }
}
class ABC {
    int phone_np;
    String name;
    static String course_name;

    public ABC(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }

    Void display() {
        System.out.println(this.phone_np + this.name + course_name);
        return display();

    }

    static void m1() {
        System.out.println("Mark attendance");
    }

}
