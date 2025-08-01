class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(long)Math.sqrt(c);

        while(a<=b){
            long ans=a*a+b*b;
            if(ans==c) return true;
            else if(ans<c) a++;
            else b--;
        }
        return false;
    }
}