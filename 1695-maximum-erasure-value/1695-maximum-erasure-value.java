class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int max=0;
        Set<Integer> list=new HashSet<>();
        int left=0;
        for(int i=0;i<nums.length;i++){
            while(list.contains(nums[i])){
                sum-=nums[left];
                list.remove(Integer.valueOf(nums[left]));
                left++;
            }
            list.add(nums[i]);
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}