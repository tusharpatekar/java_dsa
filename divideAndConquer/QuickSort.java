package divideAndConquer;

public class QuickSort {


    public static void quickSort(int arr[], int si, int ei){
        //base case

        if(si >= ei){
            return;
        }

        // last element consider as pivot

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);    // left sorting
        quickSort(arr, pIdx+1, ei);    // right sorting

    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si -1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;

    }
    public static void printArr(int[] arr){
        int i;
        for(i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){

        int[] arr = {8, 9, 5, 2, 6, -5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
