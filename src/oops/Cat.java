package oops;

public class Cat{
    public static void main(String[] args) {
        Dog c1 = new Dog();
       c1.running();

    }
}
class Dog{
    String name;
    void running(){
        System.out.println("void running");
    }
}