package Codingchallenge;

public class vehicle {

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

    // Subclass: Car
    class Car extends vehicle{
        @Override
        public void start() {
            System.out.println("Car is starting with a roar!");
        }
    }

    // Subclass: Bike
    class Bike extends vehicle {
        @Override
        public void start() {
            System.out.println("Bike is starting with a purr!");
        }
    }




