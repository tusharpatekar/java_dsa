package priorityqueueorheap;

/*

    Sliding Window Maximum
    or
    maximum of all subArrays of size k
 */

import java.util.PriorityQueue;

public class SlidingWindowUsingPQ {
    static class ArrayInfo implements Comparable<ArrayInfo>{
        int idx;
        int value;

        public ArrayInfo(int idx, int value){
            this.idx = idx;
            this.value = value;
        }

        @Override
        public int compareTo(ArrayInfo obj){
            return obj.value - this.value;
        }
    }
    public static void main(String[] args) {
//        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;  //size of the window
        int[] ans = new int[arr.length - k + 1];

        PriorityQueue<ArrayInfo> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new ArrayInfo(i,arr[i])); // add k size window to PQ
        }
        ans[0] = pq.peek().value;

        int curr = k;
        int i = 1; // index of an answer array
        while (curr < arr.length){
            // check for i-k index in the PQ
            while (pq.size() > 0 && pq.peek().idx <= (curr - k)){
                pq.remove();  // Remove until the element at having index less than curr - k. It implies that the peek is not part of window
            }
            // add the curr element into PQ
            pq.add(new ArrayInfo(curr, arr[curr]));
            ans[i] = pq.peek().value;
            curr++;
            i++;
        }
        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[j] + " ");

        }

    }
}
