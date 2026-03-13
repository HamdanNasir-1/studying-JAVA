public class AbstractClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

abstract class Car {

    abstract void start();

    abstract void accelerate();

    abstract void brake();
}

class fuelCar extends Car {

    void start() {
        System.out.println("The fuel car started");
    }

    void accelerate() {
        System.out.println("The fuel car accelerated at 30km/h");
    }

    void brake() {
        System.out.println("The fuel car is stopping");

    }
}