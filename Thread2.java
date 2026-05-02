public class Thread2 {
    public static void main(String[] args) {
        A task1 = new A();
        B task2 = new B();
        
        task2.start();
        task1.start();
    }
}
class A extends  Thread{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("A Task runnning ......" +i );
        }
    }
}   
class B extends  Thread{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("B Task runnning ......" +i );
        }
    }
}   