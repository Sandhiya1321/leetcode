class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=nums[0];
        int maxsum=nums[0];
        int curmax=nums[0];
        int minsum=nums[0];
        int curmin=nums[0];

        for(int i=1;i<nums.length;i++){
            int num=nums[i];
           curmax=Math.max(num,curmax+num);
           maxsum=Math.max(maxsum,curmax);

           curmin=Math.min(num,curmin+num);
           minsum=Math.min(minsum,curmin);

           total+=num; 
        }
        

        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);

    }
}