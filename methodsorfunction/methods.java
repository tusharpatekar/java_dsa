import java.util.*;

public class methods {
    public static int add(int a, int b) { // for mal parameters
        return a + b;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.print(add(a, b));
        // swap(a, b);
        
       // int factorial=factorial(a);
        // System.out.print(factorial);
        // binomial coefficient
        int n=factorial(a);
         int r=factorial(b);
         int nr=factorial(a-b);
         int ans=n/(r*nr);
         System.out.println(ans);

    }
}