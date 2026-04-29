

public class Exceptional_Handling {
    public static void main(String[] args) {
        
        try{
            int a = 10;
            int b = 0;

            System.out.println("The sum is : "+(a/b));
        }
        catch(Exception e){
            System.out.println("There is an exeption.....");
        }
        finally{
            System.out.println("Hello guys main to hamesha chalta huuu...");
        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a<18){
            throw new ArithmeticException("You ar too young...");
        }
        else{
            System.out.println("Welcome to our community man.......");
        }

        try{
            int arr[] = {1,2,3,4};

            System.out.println(arr[6]);
        }
        catch(IndexOutOfBoundsException e){
            System.err.println("There is an index exception..... ");
        }
        catch(ArithmeticException e){
            System.err.println("There is an arithmetic exception..... ");
        }
    }
}
