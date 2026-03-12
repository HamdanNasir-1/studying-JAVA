public class Inheritance {
    public static void main(String[] args) {
        Vehicle s1 = new Vehicle();
        s1.start();
        
    }
}

class Vehicle {
    String name;
    
}

class Car extends Vehicle {
    void start() {
        System.out.println("GGGHHHrrrrrrrrrr");
    }

}