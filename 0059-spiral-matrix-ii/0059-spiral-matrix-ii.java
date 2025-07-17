class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=n-1;
        int num=1;
        while(rowStart<=rowEnd&&colStart<=colEnd){
        for(int i=colStart;i<=colEnd;i++){
            matrix[rowStart][i]=num++;
        }
        rowStart+=1;
        for(int i=rowStart;i<=rowEnd;i++){
            matrix[i][colEnd]=num++;
        }
        
        colEnd-=1;
        if(rowStart<=rowEnd){
        for(int i=colEnd;i>=colStart;i--){
            matrix[rowEnd][i]=num++;
        }
                rowEnd-=1;

        }
        if(colStart<=colEnd){
            for(int i=rowEnd;i>=rowStart;i--){
                matrix[i][colStart]=num++;
            }
                    colStart+=1;

        }
        }
        return matrix;
    }
}