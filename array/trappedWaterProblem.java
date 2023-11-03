public class trappedWaterProblem {

    public static int trappedWater( int height[])
    {
        int n = height.length;
        // calculate leftMax boundry 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate the rightMax boundry

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop

        int trappedWaterLevel = 0;
        for(int i=0; i<n; i++)
        {

            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedWaterLevel += waterlevel - height[i];
        }

        return trappedWaterLevel;

    }
    

    public static void main(String args[])
    {
        int height[]={1,8,6,2,5,4,8,3,7 };

        System.out.println(trappedWater(height));


    }
}
