public class Classes {
    public static void main(String[] args) {
        
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