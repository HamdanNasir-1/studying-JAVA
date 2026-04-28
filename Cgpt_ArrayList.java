import java.util.*;

public class Cgpt_ArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Hamdan");
        names.add("PAPA");
        names.add("THE GREAT");
        System.out.println(names.get(2));
        names.set(2, "Sizu");
        for (String name : names) {
            System.out.println("The names are : " + name);
        }
        names.remove(2);
        System.out.println("After removing name ");
        for (String name : names) {
            System.out.println("The names are : " + name);
        }
        System.out.println(names.contains("Hamdan"));
        System.out.println(names.size());
        List<Integer> marks = new LinkedList<>();

        marks.add(56);
        marks.add(87);
        marks.add(45);
        marks.add(77);

        Iterator<Integer> it = marks.iterator();

        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
}
