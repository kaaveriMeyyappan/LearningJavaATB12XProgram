package Polymorph;

public class User {
    void login(){
        System.out.println("Userlogin");
    }
}
class Adminuser extends User{
    @Override
    void login(){
        System.out.println("Adminlogin");
    }
}
class Regularuser extends User{
    @Override
    void login(){
        System.out.println("Regularuser");
    }
}