public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Hamdan");
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(String name){
        this.name = name;
    }
}