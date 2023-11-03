public class SolidRhombus {
    public static void main(String args[]) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
/* Output:- */
/*
      ***** 
    *****
   *****
  *****
 *****   
 */
