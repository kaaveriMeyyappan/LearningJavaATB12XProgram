package Accessmodifier;

public class Methodparent {
    void display(){
        System.out.println("parent class method");
    }
}
class Chilll extends Methodparent{
    @Override
    void display() {
        super.display();
    }
}
