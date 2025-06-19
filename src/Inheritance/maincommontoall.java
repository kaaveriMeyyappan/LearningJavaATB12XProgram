package Inheritance;

public class maincommontoall {
    public static void main(String[] args) {
        Testcase1 t1 = new Testcase1();
        t1.runningTC1();
        System.out.println("----");
        Testcase2 t2 = new Testcase2();
        t2.runningTC2();
        System.out.println("executed testcase2");
    }
}
