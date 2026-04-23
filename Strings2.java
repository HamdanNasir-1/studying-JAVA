
public class Strings2 {
    public static void main(String[] args) {
        String s1 = new String();
        
        String s2 = new String("Hamdan");
        // System.out.println(s1);
        // System.out.println(s2);

        String s3 = "hamdan";//String pool
        String s4 = new String(s3);//Heap memory      

        // System.out.println(s3);

        char arr[] = {'H','a','m','d','a','n',' ','N','a','s','i','r'};
        // String s5 = new String(arr);

        // System.out.println(s5);

        String s5 = new String(arr,0,7);
        System.out.println(s5);

    }
}
