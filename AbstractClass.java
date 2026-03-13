public class AbstractClass {
    public static void main(String[] args) {
        Car fCar = new fuelCar();
        Car eCar = new eCar();
        fCar.start();
        eCar.start();
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

class eCar extends Car {

    void start() {
        System.out.println("The Electric car car is starting");

    }

    void accelerate() {
        System.out.println("The Electric car is accelearted at 50km/h");

    }

    void brake() {
        System.out.println("The Electric car car is stopping");

    }

}