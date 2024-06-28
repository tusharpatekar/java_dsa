package priorityqueueorheap;

import java.util.PriorityQueue;

/*

  * Weakest Solider

      We are given mXn binary matrix of 1's (solider) and 0's (civilians). The solider is positioned
      in front of the civilians. That is all the 1's will appears to the left off all the 0's in each
      row.

      A row i is weaker that row j if one of the following is true.
      * The number of solider in row i is less then the number of solider in row j.
      * Both row have the same number of solider and i < j
      find k weakest row

      Here both conditions imply that weakness depends on the number of solider
      if it is less than another row than it is a weak row.



 */
public class WeakestSoliderRow {
    static class RowInfo implements Comparable<RowInfo>{
        int idx;
        int soliderCount;
        public RowInfo(int idx, int soliderCount){
            this.idx = idx;
            this.soliderCount = soliderCount;
        }
        @Override
        public int compareTo(RowInfo obj){
            if(this.soliderCount == obj.soliderCount){
                return this.idx - obj.idx;
            }else {
                return this.soliderCount - obj.soliderCount;
            }
        }
    }
    public static void main(String[] args) {
        int[][] position = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int n = 4;
        int k = 2;

        PriorityQueue<RowInfo> pq = new PriorityQueue<>();

        for (int i = 0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(position[i][j] == 1){
                    count += 1;
                }

            }
            pq.add(new RowInfo(i, count));
        }
        for (int i = 0; i < k; i++) {
            System.out.print("row" + pq.remove().idx + " ");

        }

    }




}
