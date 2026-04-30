public class Lambda_1 {
    public static void  main(String[] args){

        Add h = (a,b)-> a+b;
        System.out.println("The sum is "+h.add(2, 4));

    }
}
interface Add{
    // void showName();
    int add(int a, int b);
}