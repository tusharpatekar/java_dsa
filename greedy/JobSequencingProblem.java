package greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JobSequencingProblem {
    static class Job{
        int idx;
        int deadline;
        int profit;
        public Job(int i, int d, int p){
            idx = i;
            deadline = d;
            profit = p;

        }
    }
    public static void main(String[] args){
        int[][] jobInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        // we are going to make arraylist  of type Job

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // now we are going to sort using Collection

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        //arraylist for storing index
        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i =0; i< jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.idx);
                time++;
            }
        }
        System.out.println(time);
        System.out.println(seq);




    }
}
