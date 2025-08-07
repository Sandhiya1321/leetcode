class NumArray {
    int[] ans;
    public NumArray(int[] nums) {
        ans=new int[nums.length+1];
        ans[0]=0;
        for(int i=0;i<nums.length;i++){
            ans[i+1]=ans[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return ans[right+1]-ans[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */