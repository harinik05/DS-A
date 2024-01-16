package Container_With_Most_Water;

public class Solution2 {
    public int maxArea(int[] height) {
        //1. initialize the lo and hi pointers
        int lo = 0;
        int hi = height.length-1;
        int containerHeight = 0;
        int maxWater = 0;

        //2. while loop as long as lo < hi 
        while(lo<hi){
            //3. calculate the area
            containerHeight = Math.min(height[lo], height[hi]);
            maxWater = Math.max(containerHeight * (hi-lo), maxWater);

            //4. adjust the pointers
            if(height[lo] <= height[hi]){
                lo++;
            }else{
                hi--;
            }
        }

        //5. return maxWater
        return maxWater;
    }
}