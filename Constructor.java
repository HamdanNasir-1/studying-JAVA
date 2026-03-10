
public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Hamdan");
        // Student s3 = new Student("Hamdan",23);
        // Student s4 = new Student("Hamdan",23,406);
        // Student s5 = new Student("Hamdan",23,406,"Integaral University");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
        
        // System.out.println("Printing for s2:---");
        // // Printing for s2:---
        // System.out.println(s2.name);
        // System.out.println(s2.age);
        // System.out.println(s2.rollNumber);
        // System.out.println(s2.college);
        
        // System.out.println("Printing for s3:---");
        // // Printing for s3:---
        // System.out.println(s3.name);
        // System.out.println(s3.age);
        // System.out.println(s3.rollNumber);
        // System.out.println(s3.college);
        
        // System.out.println("Printing for s4:---");
        // // Printing for s4:--
        // System.out.println(s4.name);
        // System.out.println(s4.age);
        // System.out.println(s4.rollNumber);
        // System.out.println(s4.college);

        // System.out.println("Printing for s5:---");
        // Printing for s5:--
        // System.out.println(s5.name);
        // System.out.println(s5.age);
        // System.out.println(s5.rollNumber);
        // System.out.println(s5.college);
    }
}

class Student {

    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        this("Unknown");
        System.out.println("First constructor is called");
    }
    
    Student(String name) {
        this(name,0);
        System.out.println("Sedcond constructor is called");
    }
    
    Student(String name, int age) {
        this(name,age,0);
        System.out.println("Third constructor is called");
    }
    
    Student(String name, int age, int rollNumber) {
        this(name,age,rollNumber,"Unkown");
        System.out.println("Fourth constructor is called");
    }
    
    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("Fifth constructor is called");
    }
}
