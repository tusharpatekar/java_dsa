package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnopsack {

    public static void main(String[] args){
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;
        int max = 0;

        // we have created 2-d array that stores the index of value with weight with their ratios
        double[][] ratio = new double[value.length][2];


        // we have to calculate the ratio of each value by weight so that we get the ratio if the ratio is high, so this is optimized pick
        for(int i=0; i<value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // now we have to sort that radio array to find the best ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        for(int i=value.length-1; i >= 0; i--){
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){
                max += value[idx];
                capacity -= weight[idx];

            }else {
                max += (int) (ratio[i][1] *capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(max);
        System.out.println(capacity);
    }
}
