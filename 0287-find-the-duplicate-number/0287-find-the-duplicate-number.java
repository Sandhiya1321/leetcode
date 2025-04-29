class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=i+1){
                if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                return nums[i];
            }
            }else{
                i++;
            }
        }
        return -1;
    }
    
    static void swap(int[] nums,int start,int second){
        int temp=nums[start];
        nums[start]=nums[second];
        nums[second]=temp;
    }
}