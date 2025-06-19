package multilevelInheritance;

public class multilevelmain {
    public static void main(String[] args) {
        son pranav = new son();
        pranav.bhk3();
        pranav.extra();
        pranav.gf();
        pranav.home();
        father f = new father();
        f.extra();
        f.gf();
        f.home();
        Grandfather gf = new Grandfather();
        gf.home();
        gf.gf();
    }
}
