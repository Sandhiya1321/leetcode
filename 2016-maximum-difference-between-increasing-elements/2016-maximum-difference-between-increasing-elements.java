class Solution {
    public int maximumDifference(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                   int c= nums[i]-nums[j];
                   return c;
                }
            }
        }
        return -1;
    }
}