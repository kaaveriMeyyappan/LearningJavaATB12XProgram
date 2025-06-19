package polymorphism;

public class mainoverride {
    public static void main(String[] args) {
    childoverride c1 = new childoverride();
    c1.home();
    c1.f1();
    fatheroverride f2 = new fatheroverride();
    f2.home();
    f2.f1();
    fatheroverride f3 = new childoverride();
    f3.home();
    f3.f1();
    }
}

