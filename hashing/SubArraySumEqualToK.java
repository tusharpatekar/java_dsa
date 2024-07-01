package hashing;

import java.util.HashMap;

public class SubArraySumEqualToK {
    public static int subArraySumEqualToK(int[] arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1); // if case is arr[0] = K i.e {45} and K = 45 then count should be 1.
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(hm.containsKey(sum - k)){ //sum[i] = sum[j] - k;  if sum[i] is existed in map then it implies total sum of subArray is k
                ans += hm.get(sum - k); // add it into ans
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(subArraySumEqualToK(arr, k));
    }
}
