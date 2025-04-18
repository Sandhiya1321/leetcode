class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(s<2||nums[i]!=nums[s-2]){
                nums[s]=nums[i];
                s++;
            }
            }
            return s;
    }
}