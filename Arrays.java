
public class Arrays {

    public static void main(String[] args) {

        // int arr[] = new int[4];
        // int x = 101;
        // arr[0] = 12;
        // arr[1] = 13;
        // arr[2] = 14;
        // arr[3] = 15;
        // // arr[] = 15;
        // System.out.println("Here is the first array program "+arr[0]);
        // --:Array using loops :--
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = x;
    //         x++;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println("The value for index "+i+" is "+arr[i]);
    //     }

        int[][] arr = new int[3][3];
        arr[0][0] = 50; 
        arr[0][1] = 30; 
        arr[0][2] = 90;
        arr[1][0] = 60;
        arr[1][1] = 40;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 60;
        arr[2][2] = 70;

        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][0]);
    }
}
