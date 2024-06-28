package priorityqueueorheap;

import java.util.ArrayList;

public class HeapStructure {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Step 1: Add at the last of the array
            arr.add(data);
            int x = arr.size() - 1; // Index of the child or newly inserted element
            // Step 2: Get the index of the parent of the inserted node
            int par = (x - 1) / 2;

            // Step 3: Check if the parent is greater than the child, then swap the child with the parent
            while (x > 0 && arr.get(x) < arr.get(par)) {
                // Swap child with parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par; // Now child is parent
                par = (x - 1) / 2; // Finding the parent of x now
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }

        private void heapify(int i) {
            // Step 1: Consider the ith index is the smallest index
            int minIdx = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // Step 2: Check if the left child index is less than the size of the array and if the left child is smaller than the current element (at the ith index)
            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            // Step 3: If i is still the smallest, no need to swap, else swap
            if (minIdx != i) {
                // Swapping
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));  // at ith element arr.get(minIdx) value is going to set
                arr.set(minIdx, temp);

                // Call heapify for the element at minIdx
                heapify(minIdx);
            }
        }

        public int remove() {
            // Step 1: Swap the element at the last with the first because in ArrayList, we remove from the last
            int data = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1);

            // Step 2: Now recheck if the tree or heap is a minHeap or maxHeap using the heapify function
            heapify(0); // Passing the index of the first element from which it needs to check for minHeap

            return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(6);
        h.add(2);
        h.add(3);
        h.add(1);

        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
