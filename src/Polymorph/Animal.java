package Polymorph;

public class Animal {
    public String sound(){
        return "Generic sounds are produced";
    }
}
class Dog extends Animal{
    @Override
    public String sound(){
        return "bark";
    }
}
class Cat extends Animal{
    @Override
    public String sound(){
        return "Meow";
    }
}

class Cow extends Animal{
    @Override
    public String sound(){
        return "Maa";
    }
}