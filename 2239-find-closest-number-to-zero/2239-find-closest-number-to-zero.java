class Solution {
    public int findClosestNumber(int[] nums) {
        int close=nums[0];
        for(int num:nums){
            if(Math.abs(num)<Math.abs(close)){
                close=num;
            }else if(Math.abs(num)==Math.abs(close)&&num>close){
                close=num;
            }
        }
        return close;
    }
}