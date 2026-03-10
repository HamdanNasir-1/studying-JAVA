
public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Hamdan");
        System.out.println(s1);
    }
}

class Student {

    String name;
    int age;
    int rollNumber;
    String college;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Student(String name, int age,int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber= rollNumber;
    }
}
