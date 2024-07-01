package hashing;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {
    public static int largestSubArrayWithZeroSum(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(hm.containsKey(sum)){
                ans = Math.max(ans, i - hm.get(sum));
            }else {
                hm.put(sum, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(largestSubArrayWithZeroSum(arr));
    }
}
