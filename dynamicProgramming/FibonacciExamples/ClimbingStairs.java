package dynamicProgramming.FibonacciExamples;

import java.util.Arrays;

public class ClimbingStairs {
    // using recursion
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return countWays(n - 1) + countWays(n - 2);
    }

    // using memoization
    public static int countWays(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
        return ways[n];
    }

    // using tabulation
    public static int countWaysTabulation(int n) {
        if (n == 0) return 1;  // Edge case: 1 way to stay at the ground
        if (n == 1) return 1;  // 1 way to reach the first step

        int[] ways = new int[n + 1];
        ways[0] = 1;  // 1 way to stay at the ground
        ways[1] = 1;  // 1 way to reach the first step

        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n) + " recursion");
        System.out.println(countWays(n, ways) + " memoization");
        System.out.println(countWaysTabulation(n) + " Tabulation");
    }
}
