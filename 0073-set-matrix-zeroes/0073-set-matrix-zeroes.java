class Solution {
    public void setZeroes(int[][] matrix) {
        int rowL=matrix.length;
        int colL=matrix[0].length;
        boolean[] row=new boolean[rowL];
        boolean[] col=new boolean[colL];
        for(int i=0;i<rowL;i++){
            for(int j=0;j<colL;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[i]=true;
                }
            }
        }
        for(int i=0;i<rowL;i++){
            for(int j=0;j<colL;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}