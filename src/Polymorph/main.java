package Polymorph;

public class main {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        Vehicle myCar = new Car();

        myBike.start(); // Kick start the bike
        myCar.start();  // Turn the key to start the car
    }
}
