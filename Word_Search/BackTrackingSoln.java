package Word_Search;

public class BackTrackingSoln {

    //define the member variables 
    private char[][] board;
    private int ROWSCOUNTER;
    private int COLUMNSCOUNTER;
    private String word;
    //define method: exist to check if the word exists
    public boolean doesWordExist(char[][] board, String word){
        //define the actual values of these variables
        this.board = board;
        this.ROWSCOUNTER = board.length;
        this.COLUMNSCOUNTER = board[0].length;
        this.word = word;

        //loop through the rows, then columns
        for(int row = 0;row<ROWSCOUNTER;row++){
            for(int coln= 0;coln<COLUMNSCOUNTER;coln++){
                if(this.backtrackingMeth(row, coln, 0)){
                    return true;
                }
            }
        }
        return false;

    }

    //backtracking method
    public boolean backtrackingMeth(int row, int coln, int index){
        //1. counter true case - index > lenth of word
        if(index > word.length()){
            return true;
        }

        //2. check the boundaries
        boolean rowsChecker = (row<0 || row > this.ROWSCOUNTER)?true:false;
        boolean colnsChecker = (coln<0 || coln > this.COLUMNSCOUNTER)? true: false;

        if(rowsChecker || colnsChecker || this.board[row][coln] != word.charAt(index)){
            return false;
        }

        //3. DFS - check the unexplored
        this.board[row][coln] = '*';
        int[] rowOffset = {0,1,0,-1};
        int[] colnOffset = {1,0,-1,0};

        //4. loop through the adjacent boxes
        for(int i = 0;i<4;i++){
            if(this.backtrackingMeth(row+rowOffset[i], coln+colnOffset[i], index)){
                return true;
            }
        }

        this.board[row][coln] = word.charAt(index);
        return false;
    }
    public static void main(String[] args){

    }
}
