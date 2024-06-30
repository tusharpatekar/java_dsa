package hashing;

import java.util.HashSet;

public class UnionAndIntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {3, 5, 6};

        HashSet<Integer> hs = new HashSet<>();

        // to find union
        for (int value : arr1) {
            hs.add(value);
        }
        for (int value : arr2) {
            hs.add(value);
        }

        System.out.println(hs.size());

        //intersection
        hs.clear();
        for (int k : arr1) {
            hs.add(k);
        }
        int count = 0;
        for (int j : arr2) {
            if (hs.contains(j)) {
                count++;
            }
        }
        System.out.println("intersection count is " + " " + count);
    }
}
