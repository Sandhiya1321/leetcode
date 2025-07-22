class Solution {
    public int countPrimes(int n) {
        if(n==0&&n==1){
            return 0;
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(i%2!=0){
                count++;
            }
        }
        return count;
    }
}