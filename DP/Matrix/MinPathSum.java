package Matrix;
class MinPathSum {
    //This involves calculating 
    public int minPathSum(int[][] grid) {
        //1. create a dpArr to store all of the information
        int[][] dpArr = new int[grid.length][grid[0].length];

        //2. Loop through the entire matrix from backwards to forward
        for(int i = grid.length-1;i>=0;i--){
            for(int j = grid[0].length-1;j>=0;j--){
                //corner point for i 
                if(i == grid.length-1 && j!=grid[0].length-1){
                    dpArr[i][j] = grid[i][j] + dpArr[i][j+1];
                }
                //corner point for j 
                else if(i!=grid.length-1 && j ==grid[0].length-1){
                    dpArr[i][j] = grid[i][j] + dpArr[i+1][j];
                }

                //not a corner point at all
                else if(i!=grid.length-1 && j != grid[0].length-1){
                    dpArr[i][j] = grid[i][j] + Math.min(dpArr[i+1][j], dpArr[i][j+1]);
                }

                //super duper corner point case
                else{
                    dpArr[i][j] = grid[i][j];
                }
            }
        }
        
        //return the first point 
        return dpArr[0][0];
        
    }
}
