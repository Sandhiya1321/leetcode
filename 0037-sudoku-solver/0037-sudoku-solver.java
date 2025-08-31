class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board);
        printBoard(board);
       
    }
    public void printBoard(char[][] board){
         for(char[] row:board){
            for(char col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public boolean sudoku(char[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean empty=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    row=i;
                    col=j;
                    empty=false;
                    break;
                }
            }
            if(!empty){
                break;
            }
        }
        if(empty){
            return true;
        }
        for(char i='1';i<='9';i++){
            if(isSafe(board,row,col,i)){
                board[row][col]=i;
                if(sudoku(board)){
                    return true;
                }else{
                    board[row][col]='.';
                }
            }
        }
         return false;   
    }
    public boolean isSafe(char[][] board,int row,int col,int num){
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int rowStart=row-row%sqrt;
        int colStart=col-col%sqrt;
        for(int r=rowStart;r<rowStart+sqrt;r++){
            for(int c=colStart;c<colStart+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
}