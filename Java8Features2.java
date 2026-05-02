import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Features2 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 5, 6, 8);

        // int sum = nums.stream()
        //         .reduce(2, (a, b) -> a + b);

        // System.out.println("The reduced number is :"+sum);

        nums.stream()
        .sorted(Comparator.reverseOrder())  
        .forEach(n->System.out.println(n));

    }
}
