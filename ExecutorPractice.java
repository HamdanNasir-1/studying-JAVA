
import java.util.concurrent.*;

public class ExecutorPractice {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> f1 = executor.submit(() -> {
            return 10 + 20;
        });
        Future<Integer> f2 = executor.submit(() -> {
            return 10 * 3;
        });
        Future<Integer> f3 = executor.submit(() -> {
            return 100 - 40;
        });

        try {
            System.out.println("Result 1 : " + f1.get());
            System.out.println("Result 2 : " + f2.get());
            System.out.println("Result 3 : " + f3.get());
        } catch (ExecutionException|InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        executor.shutdown();
    }
}
