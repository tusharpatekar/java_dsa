package recursion;

public class Power {


    public static int optimizedPower(int a, int n){         //O(log n)

        if(n == 0) {
            return 1;
        }


      //  int halfPower = optimizedPower(a, n/2) * optimizedPower(a, n/2);   // function is calling same function repeating
        int halfPowerOptimized  = optimizedPower(a, n/2);
        int halfPower = halfPowerOptimized * halfPowerOptimized;

        if(a%2 != 0){
            return halfPower * a;
            }

        return halfPower;
    }

    public  static void main(String[] args) {
        int a= 5;
        int n = 20;
        System.out.println(optimizedPower(a, n));
    }
}
