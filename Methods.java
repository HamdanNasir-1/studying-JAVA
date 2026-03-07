public class Methods {
    public static void main(String[] args) {

        NoINPOP ();
        NamsSayer("Hamdan");
        System.out.println(Output());
        System.out.println(Multiplier(2,4));

        
    }

    // NO input and output
    static void NoINPOP (){
        System.out.println("Hello Hamdan Bhai");
    }

    // Input but no Output
    static void NamsSayer(String name){
        System.out.println("Hello "+name);
    }

    // No input but Output
    static int Output(){
        return 10;
    }

    // Output and Input
    static int Multiplier(int a, int b){
        return (a*b);
    }
}
