public class BubbleSortCustom {

    public static void BubbleSortingCustom(int arr[])
    {
        int swap=0;
        for(int i=0; i<arr.length-1; i++)
        {
            
           
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0)
            {
                break;
            }

        }
        System.out.println(swap);
    }

    public static void display(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    


    public static void main(String args[])
    {
        int arr[] = {1, 2,4, 3};
        BubbleSortingCustom(arr);
        display(arr);

    }
}
