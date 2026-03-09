
public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        // s1.name = "Hamdan";
        // s1.age= 34;
        // s1.rollNumber = 5004;
        // s1.name = "Integral University";
        System.out.println("The name is " + s1.name);
        System.out.println("The age is " + s1.age);
        System.out.println("The rollnumber is " + s1.rollNumber);
        System.out.println("The college name is " + s1.college);
    }
}
// Default constructor or normal constructor 
// class Student{
//     String name;
//     int age;
//     int rollNumber;
//     String college;

//     Student(){
//         name = "Hamdan";
//         age = 34;
//         rollNumber = 788;
//         name = "Padrrauna University";
//     }
// }
// :--- Parameterized constructor
class Student {

    String name;
    int age;
    int rollNumber;
    String college;

    Student() {

    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;

    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
}
