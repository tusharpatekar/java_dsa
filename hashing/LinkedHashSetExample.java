package hashing;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();  // ordered

        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Kolkata");
        System.out.println(lhs);
    }
}
