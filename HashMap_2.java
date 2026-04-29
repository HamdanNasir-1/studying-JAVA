import java.util.*;
public class HashMap_2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Hamdan", 23);
        map.put("Nasir", 24);
        map.put("Shahnawaz", 25);
        map.put("Misbah", 22);

        for(String key : map.keySet()){
            System.out.println("The key is : "+key);
        }
        for(Integer value : map.values()){
            System.out.println("The values are : "+value);
        }
    }
}
