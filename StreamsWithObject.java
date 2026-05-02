import java.util.*;

public class StreamsWithObject {
    public static void main(String[] args) {

        List<student> students = new ArrayList<>();
        students.add(new student("hamdan", 22));
        students.add(new student("Littile", 7));
        students.add(new student("Bulbul", 6));
        students.add(new student("Tufaila", 10));
        students.add(new student("Faizan", 21));

        students.stream()
        .filter(n->n.age>18)
        .map(n->n.name)
        .forEach(System.out::println);
    }
}

class student {
    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}