class Solution {
    public int[] closestPrimes(int left, int right) {
       int ans[]=new int[2];
       ans[0]=-1;
       ans[1]=-1;
       int r=0;
       for(int i=left;i<=right;i++){
        if(ans[1]-ans[0]==2|| ans[1]-ans[0]==1)
        break;
        if(primeval(i)){
            if(ans[0]==-1)
                ans[0]=i;
            else if(ans[1]==-1){
                ans[1]=i;
                r=i;
            }
            else{
                if(ans[1]-ans[0]<i-r)
                    r=i;
                    else{
                        ans[0]=r;
                        ans[1]=i;
                        r=i;
                    }
                
            }
        }
       }
       if(ans[0]==-1||ans[1]==-1)
        return new int[]{-1,-1};
       return ans;
    }
    public static boolean primeval(int val){
        if(val==2)
            return true;
       if(val==1||val%2==0)
        return false;
        for(int i=3;i*i<=val;i+=2){
            if(val%i==0){
               return false;
            }
        }
        return true;
    }
}