package greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocolateProblem {

    public static void main(String[] args){
//        Integer[] verCost = {2, 1, 3, 1, 4};
//        Integer[] horCost = {4, 1, 2};
        Integer[] verCost = {4, 1};
        Integer[] horCost = {3, 2};

        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int totalCost = 0;
        while (v < verCost.length && h < horCost.length){
            if(horCost[h] <= verCost[v]){ // vertical cut
                totalCost += (verCost[v] * hp);
                v++;
                vp++;
            }else{ //horizontal cut
                totalCost += (horCost[h] * vp);
                h++;
                hp++;
            }
        }

        // remain cost in the array
        while (v < verCost.length){
            totalCost += (verCost[v] * hp);
            v++;
            vp++;
        }

        while (h < horCost.length){
            totalCost += (horCost[h] * vp);
            h++;
            hp++;
        }
        System.out.println(totalCost);
    }
}
