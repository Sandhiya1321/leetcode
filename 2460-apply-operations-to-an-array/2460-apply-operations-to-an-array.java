class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=zero){
                    int temp=nums[zero];
                    nums[zero]=nums[i];
                    nums[i]=temp;
                }
                zero++;
            }
        }
         return nums;
    }
   
}