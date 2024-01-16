package Container_With_Most_Water;

public class Solution1 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int containerWidth = 0;
        //1. for loop --> i 
        for(int i = 0;i<height.length;i++){
            for(int j = i+1;j<height.length;j++){
                //2. find the min width
                containerWidth = Math.min(height[i],height[j]);

                //3. find the max area
                maxArea = Math.max(containerWidth * (j-i),maxArea);

            }
        }

        return maxArea;
    }
}