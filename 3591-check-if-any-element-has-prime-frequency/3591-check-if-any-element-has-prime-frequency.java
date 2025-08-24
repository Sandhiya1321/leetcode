class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> frq=new HashMap<>();

        for(int num:nums){
            frq.put(num,frq.getOrDefault(num,0)+1);
        }
        for(int freq:frq.values()){
            if(prime(freq)) return true;
        }
        return false;
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