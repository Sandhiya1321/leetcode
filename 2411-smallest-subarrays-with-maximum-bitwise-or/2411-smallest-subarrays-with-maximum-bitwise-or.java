class Solution {
    public int[] smallestSubarrays(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       int[] help=new int[32];

       for(int i=n-1;i>=0;i--){
        for(int j=0;j<32;j++){
            if(((nums[i]>>j)&1)==1){
                help[j]=i;
            }
        }
        int max=0;
        for(int j=0;j<32;j++){
            max=Math.max(max,help[j]);
        }
        res[i]=max-i+1;
       } 
       return res;
    }
}