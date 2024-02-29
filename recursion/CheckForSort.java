package recursion;

public class CheckForSort {

    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1)
            return true;
        if(arr[i] > arr[i+1])
            return false;
        return isSorted(arr, i+1);

    }
    public static void main(String[] args) {

        int arr[] = {2, 6, 4, 5};

        System.out.println(isSorted(arr, 0));



    }
}
