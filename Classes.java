public class Classes {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Hamdan";
        s1.age = 23;
        s1.rollNumber= 406;
        s1.college= "Integral University Lucknow";
        // System.out.println(s1.name);
        s1.markAttandence();
        s1.printDetails();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttandence(){
        System.out.println("Attendance marked by :"+" "+name);
    }  
    void printDetails(){
        System.out.println("Name: "+name+", Age: "+age+", Rollnumber: "+rollNumber+", College: "+college);
    }
}