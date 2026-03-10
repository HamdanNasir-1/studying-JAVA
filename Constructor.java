
public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Hamdan");
        Student s3 = new Student("Hamdan",23);
        Student s4 = new Student("Hamdan",34,3409,"Integral University");

        // s1.name = "Hamdan";
        // s1.age= 34;
        // s1.rollNumber = 5004;
        // s1.name = "Integral University";
        
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
        this("Unknown",0,0,"Unknown");
    }
    
    Student(String name) {
        this(name,0,0,"Unknown");
        // this.name = name;
    }
    
    Student(String name, int age) {
        this(name,age,0,"Unknown");
        // this.name = name;
        // this.age = age;
        
    }
    
    Student(String name, int age, int rollNumber) {
        this(name,age,rollNumber,"Unknown");
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;
        
    }
    
    Student(String name, int age, int rollNumber, String college) {
        this(name,age,rollNumber,college);
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;
        // this.college = college;
    }
}