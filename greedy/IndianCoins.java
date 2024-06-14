package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] arg){
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 300;
        int count = 0;

        for(int i = 0; i<coins.length; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount){
                    amount -= coins[i];
                    count++;
                }
            }
        }
        System.out.println(count);
        // by own logic

        count = 0;
        amount = 300;
        for(int i = 0; i<coins.length; i++){
            if(coins[i] <= amount){
                int mul = amount / coins[i];
                count += mul;
                amount -= mul*coins[i];


            }
        }
        System.out.println(count);
    }
}
