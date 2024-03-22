package backTracking;

public class ArrayBackTracking {


    public static void track(int[] arr, int pos) {                      // O(n)
        // base case
        if(pos == arr.length){
            System.out.print("Array before back track :");
            printArr(arr);
            System.out.println();
            return;
        }

        // kaam
        arr[pos] = pos + 1;
        track(arr, pos + 1);

        arr[pos] = pos - 1;

    }
    public static void printArr(int[] arr){
        int i;
        for(i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args){

        int[] arr = new int[5];
        track(arr, 0);
        System.out.print("Array after back track :");
        printArr(arr);

    }
}
