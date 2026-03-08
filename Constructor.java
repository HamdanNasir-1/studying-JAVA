public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Hamdan";
        s1.age= 34;
        s1.rollNumber = 5004;
        s1.name = "Integral University";
    }
}
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

}