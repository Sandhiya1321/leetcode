class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return nums[1];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i%2!=0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}