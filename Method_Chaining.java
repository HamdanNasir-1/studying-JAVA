public class Method_Chaining {
    public static void main(String[] args) {
        greet();
    }
    static void greet(){
        System.out.println("Hello");
        greet1();
    }

    static void greet1(){
        System.out.println("Apka swagat hai");
        name("Hamdan");
        greet2();
    }
    static void name(String name){
        System.out.println(name);
    }
    
}
