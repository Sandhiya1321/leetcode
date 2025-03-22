class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int j=0;j<nums.length;j++){
        for(int i=j+1;i<nums.length;i++){
            if(nums[j]+nums[i]==target){
                return new int[] {j,i};
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
}