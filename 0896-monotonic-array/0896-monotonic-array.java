class Solution {
    public boolean isMonotonic(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-1;j++){
                if((i<=j&&nums[i]<=nums[j])||(i<=j&&nums[i]>=nums[j])){
                    return true;
                }
            }
        }
        return false;
    }
}