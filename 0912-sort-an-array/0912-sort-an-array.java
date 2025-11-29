class Solution {
    public int[] sortArray(int[] nums) {
        quick(nums,0,nums.length-1);
        return nums;
    }
    public static void quick(int[] arr,int low,int high){
        if(low>=high) return;
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];

        while(start<=end){
            while(start <= high && arr[start]<pivot) {
                start++;
            }
            while(end >= low &&arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quick(arr,low,end);
        quick(arr,start,high);
    }
}