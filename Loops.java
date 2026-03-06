
public class Loops {

    public static void main(String[] args) {
        // int i = 5;

        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        // do{
        //     System.out.println("Hello hamdan bhai ");
        //     i++;
        // }while(i<5);
        // for (int i = 10; i >= 1; i--) {
        //     for (int j = 10; j >= i; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // Break and continue
        int i;
        int p = 7;

        for (i = 2; i < 10; i++) {
            if (p % i == 0) {
                System.out.println("The number is not prime");
                break;
            }
        }

        if (i == p) {
            System.out.println("The number is Prime");
        }
    }

}
