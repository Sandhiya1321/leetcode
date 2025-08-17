class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        for(int num:nums){
            if(num%2==0){
                res[start++]=num;
            }else{
                res[end--]=num;
            }
        }
        return res;
    }
}