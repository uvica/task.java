// Base class
class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

// First subclass
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

// Second subclass
class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is being ridden.");
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {
        // Create Car object
        Car myCar = new Car();
        System.out.println("Car Actions:");
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

        System.out.println(); // Blank line for separation

        // Create Motorcycle object
        Motorcycle myBike = new Motorcycle();
        System.out.println("Motorcycle Actions:");
        myBike.startEngine();
        myBike.ride();
        myBike.stopEngine();
    }
}
