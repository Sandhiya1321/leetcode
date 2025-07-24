class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;

        int[] res=new int[size+1];

        for(int[] row:grid){
            for(int val:row){
                res[val]++;
            }
        }
        int repeat=-1;
        int miss=-1;

        for(int i=1;i<=size;i++){
            if(res[i]==2){
                repeat=i;
            }else if(res[i]==0){
                miss=i;
            }
        }
        return new int[] {repeat,miss};
    }
}