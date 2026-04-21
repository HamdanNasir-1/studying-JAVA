import java.util.Scanner;
public class Sacanner_Practice{
    public static void main(String args[]){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();

        System.out.println(name  + " is you name" );
    }
}