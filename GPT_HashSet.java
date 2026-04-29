
import java.util.*;

public class GPT_HashSet {
    public static void main(String[] args) {

        Set<Integer> marks = new HashSet<>();
        System.out.println(marks.isEmpty());
        marks.add(97);
        marks.add(82);
        marks.add(98);
        marks.add(76);
        System.out.println(marks.add(97));
        System.out.println(marks.isEmpty());
        for (int num : marks) {
            System.out.println("Marks are:" + num);
        }
        marks.remove(82);
        System.out.println("82 removed");
        System.out.println(marks.contains(97));
        System.out.println(marks.size());

    }
}
