package Polymorph;

public class employee {
    void role(){
        System.out.println("General employee");
    }
}
class Manager extends employee{
    @Override
    void role(){
        System.out.println("Manager");
    }
}
class clerk extends employee{
    @Override
    void role(){
        System.out.println("clerk");
    }
}
class Tester extends employee{
    @Override
    void role(){
        System.out.println("Tester");
    }
}