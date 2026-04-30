
import java.util.*;

public class Stream_API {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(34);
        nums.add(56);
        nums.add(78);
        nums.add(23);

        nums.stream()
        // .filter(n-> n%2==0)
        .map(n->n*2)
        .forEach(n->System.out.println(n));

    }
}
