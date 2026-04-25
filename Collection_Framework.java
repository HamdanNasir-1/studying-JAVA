import java.util.*;

public class Collection_Framework {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hamdan");
        list.add("Arsh");
        list.add("Arsalan");
        list.add("Shoaib");
        list.add("Rehan");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
