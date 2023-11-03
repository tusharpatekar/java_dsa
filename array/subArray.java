public class subArray {

    public static void printSubarrays(int numbers[])
    {
        int ts = 0;
        int max = 0;
        int min = 0;
        
        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=i; j<numbers.length; j++)
            {
                int end = j;
                int temp = 0;
                for(int k=start; k<=end; k++)
                {
                    
                    System.out.print(numbers[k]+ " ");
                    temp=temp+numbers[k];

                }
                ts++;
                if(temp>max)
                {
                    max=temp;
                }
                if(temp>min && temp<max)
                {
                    min = temp;
                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total sub array:" +  ts);
        System.out.println("min sub array addition is :" + min);
        System.out.println("Max of sub array addition is:"+ max);
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};

        printSubarrays(numbers);
    }
    

}

/*
 * 
 * 
 * output
2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

4 
4 6 
4 6 8 
4 6 8 10 

6 
6 8 
6 8 10 

8 
8 10 

10 

total sub array:15
 */