package hashing;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //put -> O(1)
        map.put("India", 2);
        map.put("AUS", 2);
        map.put("Eng", 3);
        map.put("WI", 3);

        System.out.println(map);
        // get -> O(1)
        System.out.println(map.get("India"));

        //containsKey -> O(1)
        System.out.println(map.containsKey("PAK"));

        //remove -> O(1)
        System.out.println(map.remove("WI"));
        System.out.println(map);


        // iterate O(1)
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys){
            System.out.println("Key " + " " + k + " " + "Value"+ " " + map.get(k));
        }


    }
}
