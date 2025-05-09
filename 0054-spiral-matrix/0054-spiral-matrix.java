class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        if(matrix==null||matrix.length==0){
            return result;
        }
        int rowStart=0;
        int rowEnd=matrix.length;
        int colStart=0;
        int colEnd=matrix[0].length;
        while(rowStart<rowEnd&&colStart<colEnd) {
            for (int i = colStart; i<colEnd;i++){
                result.add(matrix[rowStart][i]);
            }
            rowStart+=1;
            for (int i = rowStart; i <rowEnd; i++) {
                result.add(matrix[i][colEnd-1]);
            }
            colEnd-=1;
            if (rowStart < rowEnd) {
            for(int i=colEnd-1;i>=colStart;i--){
                result.add(matrix[rowEnd-1][i]);
            }
            rowEnd-=1;
            }
             if (colStart < colEnd) { 
            for(int i=rowEnd-1;i>=rowStart;i--){
                result.add(matrix[i][colStart]);
            }
            colStart+=1;
             }
        }
        return result;
    }
}