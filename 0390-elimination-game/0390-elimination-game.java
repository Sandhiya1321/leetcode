class Solution {
    public int lastRemaining(int n) {
        return moving(n,true);
    }
    public int moving(int n,boolean leftToRight){
        if(n==1){
            return 1;
        }
        if(leftToRight){
            return 2*moving(n/2,false);
        }else{
            return 2*moving(n/2,true)-(n%2==0?1:0);
        }
    }
}