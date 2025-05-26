class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int a=n-k;
        int b=n-1;
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        while(a<n){
            sum-=cardPoints[a];
            a++;
            b++;
            b=b%n;
             sum+=cardPoints[b];
             max=Math.max(sum,max);
        }
        return max;
    }
}