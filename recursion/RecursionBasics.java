package recursion;

public class RecursionBasics {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n + " ");
        printDec(n-1);

    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static int factorial(int n) {
        if(n == 0){
            return 1;
        }

        //int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
    }

    public static int sum(int n) {
        if(n == 0 ) {
            return 1;
        }
        int sum = n + sum(n-1);
        return sum;
    }

    public static int fibo(int n) {

        if(n == 0 || n == 1){
            return n;
        }

        int fn1 = fibo(n-1);
        int fn2 = fibo(n-2);
        int fn = fn1 + fn2;
        return fn;
    }


    public static  void main(String[] args) {
        //printDec(10);
       //  printInc(5);
//        System.out.println(factorial(5 ));
//        System.out.println(sum(10));

        System.out.println(fibo(888));

    }
}
