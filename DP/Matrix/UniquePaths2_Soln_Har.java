package Matrix;
class UniquePaths2_Soln_Har {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If the starting point or the destination point has an obstacle, there is no path
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        // Create a DP array
        int[][] dpArr = new int[m][n];

        // Initialize the starting point
        dpArr[0][0] = 1;
        //boolean flag = false;

        // Fill the first row
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                dpArr[i][0] = 0; // Set to 0 as there is an obstacle
               
            } else {
                dpArr[i][0] = dpArr[i - 1][0];
            }
        }

        // Fill the first column
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                dpArr[0][j] = 0; // Set to 0 as there is an obstacle
            
               
            } else {
                dpArr[0][j] = dpArr[0][j - 1];
            }
        }

        // Fill the DP array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dpArr[i][j] = 0; // Set to 0 as there is an obstacle
                } else {
                    dpArr[i][j] = dpArr[i - 1][j] + dpArr[i][j - 1];
                }
            }
        }

        return dpArr[m - 1][n - 1];
    }
}
