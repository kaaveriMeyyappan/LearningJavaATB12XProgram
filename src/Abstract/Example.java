package Abstract;

public class Example {
    public static void main(String[] args) {
        kaaveri k1 = new imp1();
        imp1 i1 = new imp1();
        k1.display();
        System.out.println(k1.a);
    }
}
class imp1 implements kaaveri {
    @Override
    public void display() {
        System.out.println(a);
    }
}

interface kaaveri{
    int a = 10;
    void display();

}