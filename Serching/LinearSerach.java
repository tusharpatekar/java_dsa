import java.util.*;

public class LinearSerach {

    public static void LinearSerachFunction(int num[],int key)
    {
       // int flag =0;
        for(int i =0 ; i < num.length;i++)
        {
            if(num[i]==key)
            {
                System.out.println("Key is found at Position :" + i );
                break;


            }
            
        }
    }

    public static void main (String[] args)
    {
        int num[]={4,2,5,3,9};
        int key = 8 ;

        LinearSerachFunction(num, key);

    }
    
}
