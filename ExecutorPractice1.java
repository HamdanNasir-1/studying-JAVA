
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.*;

public class ExecutorPractice1 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<String> f1 = executor.submit(() -> {
            System.out.println("Fetching user data...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "User data";
        });
        Future<String> f2 = executor.submit(() -> {
            System.out.println("Fetching order data...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Order data";
        });
        Future<String> f3 = executor.submit(() -> {
            System.out.println("Fetching payment data...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Payment data";
        });

        List<Future<String>> futures = Arrays.asList(f1, f2, f3);
JDB
        for (Future<String> f : futures) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
