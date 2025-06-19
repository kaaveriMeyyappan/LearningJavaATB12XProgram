package Encap;

public class Thief {
    public static void main(String[] args) {
        Cop Thief = new Cop(10,"Test");

        Thief.canIshoot();
        System.out.println(Thief.gun);
        System.out.println(Thief.icard);

    }
}
