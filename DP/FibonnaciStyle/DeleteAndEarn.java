package DP.FibonnaciStyle;


import java.util.HashMap;
import java.util.Map;

class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        //1. Create a table for storing the value for nums
        int n = 0;
        
        Map<Integer, Integer> pointsTable = new HashMap<>();
        for(int num:nums){
            pointsTable.put(num,pointsTable.getOrDefault(num,0) + num);
            n = Math.max(n, num);
        }

        //2. Set up the base cases
        int first = 0;
        int second = pointsTable.getOrDefault(1,0);
        int third =0;
        for(int i = 2;i<=n+1;i++){
            third = Math.max(first+pointsTable.getOrDefault(i,0),second);
            first = second;
            second = third;
        }
        return third;

    }
}
