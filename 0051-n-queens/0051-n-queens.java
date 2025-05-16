class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions=new ArrayList<>();
         boolean[][] board=new boolean[n][n];
         queen(board,0,solutions);
         return solutions;

    }
    public void queen(boolean[][] board,int row,List<List<String>> solutions){
        //if all queens are placed
          if (row == board.length) {
            solutions.add(display(board)); 
            return;
        }


        //placing the queen and checking for every row and column
        for(int col=0;col<board.length;col++){
            //place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col]=true;
                queen(board,row+1,solutions);
                board[row][col]=false;
            }
        }
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //check vertical
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                //if true u cant place
                return false;
            }
        }
        //diagonal left
        int maxLeft=Math.min(row,col);
        for (int i = 1; i <=maxLeft ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxRight=Math.min(row,board.length-col-1);
        for (int i = 1; i <=maxRight ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public List<String> display(boolean[][] board) {
         List<String> formatted = new ArrayList<>();
        for(boolean[] row:board){
           StringBuilder str=new StringBuilder();
           for (boolean cell : row) {
                str.append(cell ? "Q" : ".");
            }
            formatted.add(str.toString());
        }
        return formatted;
    }

}