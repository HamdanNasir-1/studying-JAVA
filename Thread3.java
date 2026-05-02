public class Thread3 {
    public static void main(String[] args) {
        Runnable task = ()->{
            System.out.println("Task running...");
        };

        // Thread t = new Thread(task);
        // t.start();

        new Thread(task).start();
    }
}
