 class Solution {
    public int missingNumber(int[] nums) {
       int i=0;
       while(i<nums.length){
        int correct=nums[i];
        if(nums[i]<nums.length&&nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }
        else{
            i++;
        }
       }
       for(int j=0;j<nums.length;j++){
        if(nums[j]!=j){
            return j;
        }
       }
       return nums.length;
    }
    public void swap(int[] nums,int start,int second){
        int temp=nums[start];
        nums[start]=nums[second];
        nums[second]=temp;
    }
}
