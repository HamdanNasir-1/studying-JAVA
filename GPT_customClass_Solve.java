import java.util.*;

public class GPT_customClass_Solve {
    public static void main(String[] args) {

        List<Student> details = new ArrayList<>();
        details.add(new Student("Hamdan", 22));
        details.add(new Student("Zulfakkar", 25));
        details.add(new Student("Salimun", 67));

        for(Student s:details){
            System.out.println("Name: "+s.name+" Age:"+s.age);
        }
        
    }
}   

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

}