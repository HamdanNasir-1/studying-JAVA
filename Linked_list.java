
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(67);
        list.add(87);
        list.add(98);
        list.add(90);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
