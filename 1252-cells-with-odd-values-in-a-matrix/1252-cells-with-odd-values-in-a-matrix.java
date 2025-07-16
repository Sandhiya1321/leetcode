class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row=new int[m];
        int[] col=new int[n];

        for(int[] num:indices){
            row[num[0]]++;
            col[num[1]]++;
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=row[i]+col[j];
                if(sum%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}