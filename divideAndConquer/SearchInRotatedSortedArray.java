package divideAndConquer;

public class SearchInRotatedSortedArray {

    public static int search(int[] arr, int tar, int si, int ei) {

        // Terminating Condition
        if(si > ei){
            return -1;
        }


        // Searching

        int mid = si + (ei -si)/2;
        if (arr[mid] == tar) {
            return mid;
        }
        // for L1
        if(arr[si] <= arr[mid]){

            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else {
                return  search(arr, tar, mid+1, ei);
            }
        } else {
            //case a: left
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } else {
                return search(arr, tar, si, mid+1);
            }

        }


    }

    public static void main(String[] args){
        int[] arr = {5, 7, 0, 1 , 2};
        System.out.println(search(arr, 0, 0, arr.length-1));
    }


}
