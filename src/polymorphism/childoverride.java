package polymorphism;

public class childoverride extends fatheroverride{
    @Override
    void home(){
        System.out.println("childoverride");
    }
    void f1(){
        System.out.println("child home");
    }
}
