package recursion;

public class FirstOccurence {

    public static int isFind(int arr[], int key, int i){
        if(arr[i] == key)
            return i;
        if(i == arr.length-1)
            return -1;

        return isFind(arr, key, i+1);
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 6, 8};
        int key = 6;

        System.out.println(isFind(arr, key, 0));

    }
}
