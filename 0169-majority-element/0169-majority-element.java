class Solution {
    public int majorityElement(int[] nums) {
        int item=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                item=nums[i];
            }
            else if(nums[i]==item){
                count++;
            }else{
                count--;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==item){
                c++;
            }
        }
        return c>nums.length/2?item:-1;
    }
}