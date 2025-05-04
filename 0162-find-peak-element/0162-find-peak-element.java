class Solution {
    public int findPeakElement(int[] nums) {
        
        for(int i=1;i<=nums.length-2;i++){
            
            int mis=0;
            if(nums[i-1]<nums[i]&&nums[i]>nums[i+1]){
                mis=1;
            }
            if(mis==1){
                return i;
            }
        }
       if(nums.length<=2){
            return 0;
       }
       return -1;
    }
}
   
