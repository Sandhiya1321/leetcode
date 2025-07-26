class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int max=0;

        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    if(i==0||j==0){
                        ans[i][j]=1;
                    }else{
                        ans[i][j]=Math.min(Math.min(ans[i-1][j],ans[i][j-1]),ans[i-1][j-1])+1;
                    }
                    max=Math.max(max,ans[i][j]);
                }
            }
        }
        return max*max;
    }
}