class Solution {
    
    public int[][] rotate(int[][] mat){
        int n=mat.length;
        int[][] rot=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rot[j][n-1-i]=mat[i][j];
            }
        }
        return rot;
    }
    public boolean equal(int[][] mat1,int[][] mat2){
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                if(mat1[i][j]!=mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(equal(mat,target)){
                return true;
            }
            mat=rotate(mat);
        }
        return false;
    }
}