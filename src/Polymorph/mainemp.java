package Polymorph;

public class mainemp {
    public static void main(String[] args) {
        employee m1 = new Manager();
        employee c1 = new clerk();
        employee t1= new Tester();
        m1.role();
        c1.role();
        t1.role();
    }
}
