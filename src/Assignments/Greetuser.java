package Assignments;

public class Greetuser {
    void greet(){
        System.out.println("hello");
    }
    void greet(String name){
        System.out.println("Hello "+name+ "!");
    }

    public static void main(String[] args) {
        Greetuser greeter = new Greetuser();
        greeter.greet();
        greeter.greet("kaaveri");
    }
}
