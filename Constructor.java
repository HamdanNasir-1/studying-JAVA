public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        // s1.name = "Hamdan";
        // s1.age= 34;
        // s1.rollNumber = 5004;
        // s1.name = "Integral University";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){
        name = "Hamdan";
        age = 34;
        rollNumber = 788;
        name = "Padrrauna University";
    }
}