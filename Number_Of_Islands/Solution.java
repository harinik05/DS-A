package Number_Of_Islands;

public class Solution {

    public int numIslands(char[][] grid){
        //1. initialize the variables
        int rows = grid.length;
        int columns = grid[0].length;
        int counter = 0;

        //2. double for loop 
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                //a. check if 1 is in the grid search
                if(grid[i][j] == '1'){
                    counter++;
                    callbfs(grid, i, j);
                }
            }
        }
        //3. return the counter
        return counter;
    }

    private void callbfs(char[][] grid, int i, int j){
        //1. check the boundaries and visited status
        if(i<0 || i>=grid.length|| j<0 || j>= grid[0].length|| grid[i][j] == '0'){
            return;
        }

        //2. check the visited
        grid[i][j] = '0';

        //up
        callbfs(grid, i+1, j);
        //down
        callbfs(grid, i-1, j);
        //left
        callbfs(grid, i, j-1);
        //right
        callbfs(grid, i, j+1);
    }
    public static void main(String[] args){

    }
}
