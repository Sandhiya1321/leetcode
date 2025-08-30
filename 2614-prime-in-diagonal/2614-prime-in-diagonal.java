class Solution {
    public int diagonalPrime(int[][] nums) {
        int prme=0;
        for(int i=0;i<nums.length;i++){
            int dig=nums[i][i];
            int dig2=nums[i][nums.length-i-1];
            if(prime(dig)){
                prme=Math.max(prme,dig);
            }
            if(prime(dig2)){
                prme=Math.max(prme,dig2);
            }
        }
        return prme;
    }
    boolean prime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}