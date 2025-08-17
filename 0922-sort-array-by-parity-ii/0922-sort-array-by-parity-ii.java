class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int start=0;
        int end=1;
        for(int num:nums){
            if(num%2==0){
                res[start]=num;
                start+=2;
            }else{
                res[end]=num;
                end+=2;
            }
        }
        return res;
    }
}