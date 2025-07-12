package Polymorph;

// Base class
class Vehicle {
    void start() {
        System.out.println("Starting the vehicle...");
    }
}

// Derived class 1
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Kick start the bike");
    }
}

// Derived class 2
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Turn the key to start the car");
    }
}


