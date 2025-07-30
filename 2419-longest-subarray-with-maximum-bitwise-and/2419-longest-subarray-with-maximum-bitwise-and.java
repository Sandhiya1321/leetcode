class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        int maxlen=0;
        int cur=0;
        for(int num:nums){
            if(num==max){
              cur++;
              maxlen=Math.max(maxlen,cur);  
            }
            else{
                cur=0;
            }
        }
        return maxlen;
    }
}