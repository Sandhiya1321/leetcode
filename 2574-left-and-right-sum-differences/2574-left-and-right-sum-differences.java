class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=totalSum-left-nums[i];
            ans[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return ans;
    }
}