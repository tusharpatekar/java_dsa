package bitmanipulation;

import java.util.Scanner;

public class GetIthbit {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        System.out.print("Enter the ith position:");
        int i = sc.nextInt();

        int BitMask = 1 << i;

        if((num & BitMask) == 0){
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }




    }

}
