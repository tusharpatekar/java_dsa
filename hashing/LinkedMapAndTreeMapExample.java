package hashing;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedMapAndTreeMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();  // all operation TC is O(1) LinkedListMap stored pair according to their income order
        lm.put("Mi", 5);
        lm.put("Csk", 5);
        lm.put("Kkr", 4);
        System.out.println(lm);

        TreeMap<String, Integer> tm = new TreeMap<>();  // all operation TC is O(logn) TreeMap sorted Pair in the sorted form
        tm.put("MI", 5);
        tm.put("CSK", 5);
        tm.put("KKR", 4);
        System.out.println(tm);

    }
}
