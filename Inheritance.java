public class Inheritance {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.start();
        Car c1 = new Car();
        c1.start();
        c1.RunsOn();
    }
}

class Vehicle {

    // Vehicle(String name) {
    //     this.name = name;
    // }

    void start() {
        System.out.println("GGGHHHrrrrrrrrrr");
    }

}

class Car extends Vehicle {

    void RunsOn() {
        System.out.println("Car runs on fuel...");
    }
}