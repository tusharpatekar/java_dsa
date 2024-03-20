package divideAndConquer;

public class MergeSorting {


    public static void mergeSort(int[] arr, int si, int ei) {
        //base case

        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);              // for left side sorting
        mergeSort(arr, mid+1, ei);         // for right side sorting

        merge(arr, si, mid, ei);

    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int i = si;  //for left part
        int j = mid + 1; //for right part
        int k = 0;   //for temp arr

        while (i <= mid && j <= ei){
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left element in left array
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //left element in right array

        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }

    public static void printArr(int[] arr){
        int i;
        for(i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 5, 9, 20, 2};

        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);


    }
}
