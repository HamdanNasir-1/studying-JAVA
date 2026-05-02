
public class ThreadPractice {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread printing number :" + i);
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(() -> {
            for (char c = 'A'; c < 'D'; c++) {
                System.out.println("Thread printing character :" + c);
            }
        });
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main done....");
    }
}
