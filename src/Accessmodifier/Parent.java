package Accessmodifier;

public class Parent {
    Parent(){
        System.out.println("parent constructor called");
    }
}
class child extends Parent{
    child(){
        super();
            System.out.println("child constructor called");
    }
}