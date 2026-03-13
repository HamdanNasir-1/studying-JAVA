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