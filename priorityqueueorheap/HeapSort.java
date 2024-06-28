package priorityqueueorheap;

public class HeapSort {


    // it heapify in maxHeap
    public static void heapify(int[] arr, int i, int size){
        int left = (2*i)+1;
        int right = 2 * i + 2;
        int maxHeap = i;
        if(left < size && arr[left] > arr[maxHeap]){
            maxHeap = left;
        }
        if(right < size && arr[right] > arr[maxHeap]){
            maxHeap = right;
        }

        if(maxHeap != i){
            //swap the node
            int temp = arr[i];
            arr[i] = arr[maxHeap];
            arr[maxHeap] = temp;

            //call for maxHeap indexed element
            heapify(arr, maxHeap, size);
        }
    }
    public static void sort(int[] arr){
        //step 1 -> build a MaxHeap
        int n = arr.length;
        for (int i = n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        //step 2 -> push first element at last
        for(int i = n-1; i>0; i--){  // we are not going to consider element which swapped.
            // swap the first element with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);

        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 2, 1};
        sort(arr);
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
