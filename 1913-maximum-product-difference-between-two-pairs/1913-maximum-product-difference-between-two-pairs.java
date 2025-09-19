class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int maxProd=nums[n-1]*nums[n-2];
       int minProd=nums[0]*nums[1];

       return maxProd-minProd;
    }
}