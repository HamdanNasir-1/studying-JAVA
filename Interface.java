public class Interface {
    public static void main(String[] args) {

    }
}

interface Car {
    void Start();

    void accelerattion();

    void brake();
}

class electricCar implements Car {
    public void Start(){
        System.out.println("The Electric car is started....");
    }
    
    public void accelerattion(){
        
        System.out.println("The Electric car is started....");
    }
    
    public void brake(){
        
        System.out.println("The Electric car is started....");
    }
}