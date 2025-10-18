class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int i:deck){
            count.put(i,count.getOrDefault(i,0)+1);
        }

        int gcd=0;
        for(int i:count.values()){
            gcd=GCD(gcd,i);
        }
        return gcd>1;
    }
    public int GCD(int a,int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
}