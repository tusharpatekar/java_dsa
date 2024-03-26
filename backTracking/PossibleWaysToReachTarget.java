package backTracking;

public class PossibleWaysToReachTarget {

    // This Grid problem



    // count

    public static int gridCount(int i, int j, int m, int n){
        // base case

        if(i == m-1 && j == n-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }

        // work

        int w1 = gridCount(i+1, j, m, n);
        int w2 = gridCount(i, j+1, m, n);

        return w1 + w2;
    }
    public static void main(String[] args){

        int m = 3, n = 3;
        System.out.println("Possible way to reach end of grid is :" + gridCount(0,0,m,n));

    }
}
