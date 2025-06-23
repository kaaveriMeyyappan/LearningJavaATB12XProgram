package Codingchallenge;


class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

