
public class Arrays {

    public static void main(String[] args) {

        int arr[] = new int[4];
        int x = 101;
        // arr[0] = 12;
        // arr[1] = 13;
        // arr[2] = 14;
        // arr[3] = 15;
        // // arr[] = 15;
        // System.out.println("Here is the first array program "+arr[0]);
        // Array using loops :--
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        System.out.println("The first index's value "+arr[0]);
        System.out.println("The first index's value "+arr[1]);
        System.out.println("The first index's value "+arr[2]);
        System.out.println("The first index's value "+arr[3]);
    }
}
