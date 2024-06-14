package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionUnsorted {
    public static void main(String[] args){
        int[] start = {3, 2, 5, 5, 8, 0};
        int[] end =   {4, 1, 9, 7, 9, 6};
        ArrayList<Integer> ans = new ArrayList<>();

        // here end array is unsorted we have make that array sorted
        //we are going to use sorting using 2d array
        int[][] activities = new int[start.length][3];
        // 0th index should maintain index , 1st index consists of start pointer, 2nd consists of end pointer

        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

        int maxCount = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<start.length; i++){
            if(activities[i][1] >= lastEnd){
                maxCount++;
                lastEnd = activities[i][2];
                ans.add(activities[i][0]);
            }
        }

        System.out.println(ans);
        System.out.println(maxCount);

    }
}
