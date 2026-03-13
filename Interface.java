public class Interface {
    public static void main(String[] args) {
        Car Ec = new electricCar();
        Ec.Start();
        Ec.accelerattion();
        Ec.brake();
        System.out.println("");
        Car Fc = new fuelCar();
        Fc.Start();
        Fc.accelerattion();
        Fc.brake();
    }
}

interface Car {
    void Start();

    void accelerattion();

    void brake();
}

class electricCar implements Car {
    public void Start() {
        System.out.println("The Electric car is started....");
    }

    public void accelerattion() {

        System.out.println("The Electric car has accelerated on 40km/h....");
    }

    public void brake() {

        System.out.println("The Electric car is stopping....");
    }
}

class fuelCar implements Car {
    public void Start() {
        System.out.println("The Fuel_Car car is started....");
    }

    public void accelerattion() {

        System.out.println("The Fuel_Car car has accelerated on 40km/h....");
    }

    public void brake() {

        System.out.println("The Fuel_Car car is stopping....");
    }
}