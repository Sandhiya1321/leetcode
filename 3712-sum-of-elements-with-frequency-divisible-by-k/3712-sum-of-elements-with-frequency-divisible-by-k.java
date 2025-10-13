class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           int fre= freq(nums,nums[i]);
           if(fre%k==0){
            sum+=nums[i];
           }
        }
        return sum;
    }
    public int freq(int[] nums,int target){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        return count;
    }
}