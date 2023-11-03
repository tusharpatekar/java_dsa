public class ButterflyPattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (8 - 2 * i); j++) {

                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = 3; i >=1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= (8 - 2 * i); j++) {

                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* OutPut:- */
/*


*      *
**    **
***  ***
********
***  ***
**    **
*      * 

*/
