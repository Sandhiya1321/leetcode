class Solution {
    public int search(int[] nums, int target) {
        int Pivot=pivot(nums);
        if(Pivot==-1){
            return binary(nums,target,0,nums.length-1);
        }
        if(nums[Pivot]==target){
            return Pivot;
        }
        if(target>=nums[0]){
            return binary(nums,target,0,Pivot-1);
        }
        return binary(nums,target,Pivot+1,nums.length-1);
    }
     static int binary(int[] arr,int target,int start,int end){

        while(start<=end) {
            int mid = start + (end - start) / 2;
             if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
      public int pivot(int[] nums){
         int start=0;
         int end=nums.length-1;
        while(start<=end){
        int mid=start+(end-start)/2;
        if(mid<end && nums[mid]>nums[mid+1]){
            return mid;
        }
         if(mid>start&&nums[mid]<nums[mid-1]){
            return mid-1;
        }
        if(nums[mid]<=nums[start]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
   }  
}