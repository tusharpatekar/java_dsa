package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(6);
        set.add(6);
        set.add(4);

        System.out.println(set);
        System.out.println("let check for set contains 5 or not" + " " + set.contains(5));

        // using implement the Iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        //advanced loop
        for (Integer key : set){
            System.out.println(key);
        }
    }
}
