class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        int sub=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        sub=prod-sum;
        return sub;
    }
}