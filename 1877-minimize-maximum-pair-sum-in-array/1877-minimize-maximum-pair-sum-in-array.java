class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            max=Math.max(max,sum);
            i++;
            j--;
        }
        return max;
    }
}