package dynamicProgramming.KnapSackExample;

import java.util.Arrays;

public class ZeroOneKnapSack {

    // recursion
    public static int knapSack(int[] val, int[] wt, int W,  int n){
        //base case
        if(W == 0 || n == 0){
            return 0;
        }
        if(wt[n-1] <= W){ // valid
            //include
            int includeProfit = val[n-1] + knapSack(val, wt, W-wt[n-1], n-1);
            // exclude
            int excludeProfit = knapSack(val, wt, W, n-1);

            return Math.max(includeProfit, excludeProfit);
        } else {  // invalid
            return knapSack(val, wt, W, n-1);
        }
    }
    // memoization
    public static int knapSack(int[] val, int[] wt, int W, int n, int[][] dp) {
        if (W == 0 || n == 0) {
            return 0;
        }
        // already in dp
        if (dp[n][W] != -1){
            return dp[n][W];
        }

        //valid
        if(wt[n-1] <= W){
            //include
            int includeProfit = val[n-1] + knapSack(val, wt, W - wt[n-1], n-1, dp);
            //exclude
            int excludeProfit = knapSack(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(includeProfit, excludeProfit);
        } else {
            dp[n][W] = knapSack(val, wt, W, n-1, dp);
        }
        return dp[n][W];
    }

    // tabulation
    public static int knapSackTab(int[] val, int[] wt, int W, int n, int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;  // it base case
        }
        Arrays.fill(dp[0], 0);
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W +1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j){
                    int includeProfit = v + dp[i - 1][j - w];
                    //exclude
                    int excludeProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                } else {  // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println("MaxProfit using Recursion : " + knapSack(val, wt, W, val.length));

        int[][] dp = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println("MaxProfit using Memoization : " + knapSack(val, wt, W, val.length, dp));

        // tabulation
        dp = new int[val.length + 1][W + 1];
        System.out.println("MaxProfit using tabulation : " + knapSackTab(val, wt, W, val.length, dp));

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

    }
}
