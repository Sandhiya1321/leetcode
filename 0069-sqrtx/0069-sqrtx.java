class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int res=0;
        int start=0;
        int end=x/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid<=x){
                res=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return res;
    }
}