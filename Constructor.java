public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Hamdan",34,344,"Inetgral");

        // s1.name = "Hamdan";
        // s1.age= 34;
        // s1.rollNumber = 5004;
        // s1.name = "Integral University";
        System.out.println("The name is "+s1.name);
        System.out.println("The age is "+s1.age);
        System.out.println("The rollnumber is "+s1.rollNumber);
        System.out.println("The college name is "+s1.college);
    }
}      jns,kbfjlw
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
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(String n,int a , int roll,String col){
        name = n;
        age = a;
        rollNumber = roll;
        college = col;
    }
}