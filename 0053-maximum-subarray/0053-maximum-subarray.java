class Solution {
    public int maxSubArray(int[] nums) {         
       int csum=nums[0];
       int max=nums[0];
      
       for(int i=1;i<nums.length;i++){
        csum=Math.max(nums[i],csum+nums[i]);
        max=Math.max(max,csum);
       }
       return max;
    }
}