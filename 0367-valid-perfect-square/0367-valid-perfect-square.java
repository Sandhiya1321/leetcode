class Solution {
    public boolean isPerfectSquare(int num) {
       int ans=squrt(num);
       return ans*ans==num?true:false; 
    }
    private int squrt(int num){
        if(num<2) return num;

        int ans=(int)(2*Math.sqrt(num/4));
        ans++;

        if(ans*ans>num) return ans-1;
        return ans;
        
    }
}