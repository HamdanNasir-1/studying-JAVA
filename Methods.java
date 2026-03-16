
public class Methods {

    public static void main(String[] args) {

        //     NoINPOP ();
        //     NamsSayer("Hamdan");
        //     System.out.println(Output());
        //     System.out.println(Multiplier(2,4));
        // Method overloading
        System.out.println(Sum(2, 3));
        System.out.println(Sum(2, 3, 6));
        System.out.println(Sum(3.141592653589793, 3));
        greet(45, "Hamdan");
        greet("Hamdan",45);

    }

    // // NO input and output
    // static void NoINPOP (){
    //     System.out.println("Hello Hamdan Bhai");
    // }
    // // Input but no Output
    // static void NamsSayer(String name){
    //     System.out.println("Hello "+name);
    // }
    // // No input but Output
    // static int Output(){
    //     return 10;
    // }
    // // Output and Input
    // static int Multiplier(int a, int b){
    //     return (a*b);
    // }

    // Method overloading
    static int Sum(int a, int b) {
        return a * b;
    }

    static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    static int Sum(double d, double f) {
        return (int) (d * f);
    }

    static void greet(String name, int age) {
        System.out.println("Hello " + name + " of age " + age);
    }

    static void greet(int age, String name) {
        System.out.println("Hello " + name + " of age " + age);
    }sjdfho
}
