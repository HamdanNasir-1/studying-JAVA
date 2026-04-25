
import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(32);
        list.add(31);
        list.add(30);
        list.add(29);
        list.add(28);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
