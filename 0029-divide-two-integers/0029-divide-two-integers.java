class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean isNegative=(dividend<0)^(divisor<0);
        long absDividend=Math.abs((long)dividend);
        long absDivisor=Math.abs((long)divisor);
        int res=0;
        while(absDividend>=absDivisor){
            long tempDivisor=absDivisor;
            int multiply=1;
            while(absDividend>=(tempDivisor<<1)){
                tempDivisor<<=1;
                multiply<<=1;
            }
            absDividend=absDividend-tempDivisor;
            res=res+multiply;
        }
        return isNegative? -res:res;
    }
}