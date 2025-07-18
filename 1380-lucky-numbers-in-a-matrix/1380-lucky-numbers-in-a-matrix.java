class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            int min=matrix[i][0];
            int minInd=0;
            for(int j=0;j<col;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minInd=j;
                }
            }
            boolean max=true;
            for(int k=0;k<row;k++){
                if(matrix[k][minInd]>min){
                    max=false;
                    break;
                }
            }
            if(max){
                list.add(min);
            }
        }
        return list;
    }
}