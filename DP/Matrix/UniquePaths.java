package Matrix;

import java.util.Arrays;

class UniquePaths {
    public int uniquePaths(int m, int n) {
        //Use matrix method with DP - The time complexity for this will be O(N*M)
        int[][] dpArr = new int[m][n];

        //1. Fill everything with 1
        for(int[] arr: dpArr){
            Arrays.fill(arr, 1);
        }

        //2. Check the rows and columns starting from index 1
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                dpArr[i][j] = dpArr[i-1][j] + dpArr[i][j-1];
            }
        }
        
        //3. Return the final answer: Number of ways to reach that element
        return dpArr[m-1][n-1];
    }
}
