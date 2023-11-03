public class ReverseArray {
     
    public static void  reverse(int number[])
    {
        int first = 0;
        int last = number.length-1;

        while(first < last)
        {
            int temp = number[last];
            number[last]=number[first];
            number[ first]=temp;

            first ++;
            last --;
        }   
    }

    public static void main(String[] args)
    {
        int num[]={1,2,4,5};

        reverse(num);

        for(int i=0 ; i<num.length;i++)
        {
            System.out.println("array is : "+ num[i]);
        }
    }
}
