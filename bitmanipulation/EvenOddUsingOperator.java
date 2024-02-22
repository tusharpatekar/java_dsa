package bitmanipulation;

import java.util.Scanner;

public class EvenOddUsingOperator {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int bit = 1;
        if( (n & bit) == 1) {
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
