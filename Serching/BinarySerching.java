import java.util.*;
public class BinarySerching {
    
    public static int Search(int arr[],int key)
    {
        int start =0 ;
        int end=arr.length-1;
        while(start <= end)
        {
            int mid = (start + end) /2;
            if(arr[mid] == key )
            {
                return mid;
            }
            if(arr[mid] < key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid-1;
            }


        }

        return -1;

    }

    public static void main(String[] args)
    {
        int arr[] = {2,4,6,8,10};
        int key = 0;

        System.out.println("Index for key is :" + Search(arr, key));

    }
}
