class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] boxC=new int[100];
        int max=0;
        for(int i=lowLimit;i<=highLimit;i++){
            int box=sum(i);
            boxC[box]++;
            max=Math.max(max,boxC[box]);
        }
        return max;
    }
    public int sum(int n){
    int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}