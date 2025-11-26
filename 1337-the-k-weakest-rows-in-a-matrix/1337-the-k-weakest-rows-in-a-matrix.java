class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int m=mat.length;
        int n=mat[0].length;

    PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
        if(a[0]==b[0]) return a[1]-b[1];
        return a[0]-b[0];
    });
    for(int i=0;i<m;i++){
        int sol=count(mat[i]);
        pq.add(new int[]{sol,i});
    }
    int[] res=new int[k];
    for(int i=0;i<k;i++){
        res[i]=pq.poll()[1];
    }
    return res;
    }


    private int count(int[] row){
        int low=0;
        int high=row.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(row[mid]==1){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}