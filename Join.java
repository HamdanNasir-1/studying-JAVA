

public class Join {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for(int i = 0;i<3;i++){
                System.out.println("Thread "+i);
            }
        });
        t.start();

        try{
            t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main finished ...");
    }
}
