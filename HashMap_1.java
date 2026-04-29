import java.util.*;

public class HashMap_1 {
    public static void main(String [] args){

        Map<String,Integer> m = new HashMap<>();

        m.put("Hamdan", 22);
        m.put("Arsh", 22);
        m.put("Arsalan", 22);
        m.put("Shoaib", 22);
        m.put("Haris", 26);

        System.out.println(m.containsKey("Arsh"));
        System.out.println(m.containsKey("Hammad Faizi"));
        System.out.println(m.get("Arsalan"));

        m.remove("Haris");
        System.out.println("Haris removed");

        m.put("Arsh", 23);

        for(Map.Entry<String, Integer> entry : m.entrySet()){
            System.out.println("The name is : "+entry.getKey()+" and  "+"Age is : "+entry.getValue());
        }
    }
}
