class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int size=m*n;
        int[] row=new int[size];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                row[i*n+j]=grid[i][j];
            }
        }
        int[]  ans=new int[size];
        for(int i=0;i<size;i++){
            ans[(i+k)%size]=row[i];
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<size;i+=n){
            List<Integer> rows=new ArrayList<>();
            for(int j=0;j<n;j++){
                rows.add(ans[i+j]);
            }
            res.add(rows);
        }
        return res;
    }
}