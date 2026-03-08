public class Classes {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Hamdan";
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttandence(){
        System.out.println("Attendance marked by :"+name);
    }  
    void printDetails(){
        System.out.println(name+","+age+","+rollNumber+","+college);
    }
}