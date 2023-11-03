public class ZeroOneTriangle {
   
    public static void main(String[] args){
         int count = 1;
        for (int i = 1; i <=5; i++){
            for (int j = 1; j <= i; j++){
                if (count==1){
                    System.out.print(count + " ");
                    count=0;
                }
                else{
                    System.out.print(count + " ");
                    count=1;
                }

            }
            System.out.println();
        }
        
    }
}
/* Output:- */
/*
1
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 
 */