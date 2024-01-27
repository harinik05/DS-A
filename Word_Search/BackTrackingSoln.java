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

        //2. 
    }
    public static void main(String[] args){

    }
}
