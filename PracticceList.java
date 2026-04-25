
import java.util.*;

public class PracticceList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("hamdan");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
