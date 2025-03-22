class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
   int n=nums.length;
   int[] res=new int[n];
   int index=0;
   int greterIndex=nums.length-1;
   int pivotCount=0;
       for(int i=0;i<n;i++){
        if(nums[i]<pivot){
            res[index++]=nums[i];
        }
        else if(nums[i]==pivot)
            pivotCount++;
        
       }
       while(pivotCount>0){
        res[index++]=pivot;
        pivotCount--;
       }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
            res[index++]=nums[i];

            }
    }
    return res;
}
}