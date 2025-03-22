class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findfirst(nums,target);
        int last=findLast(nums,target);
        return new int[]{first,last};
    }
    public static int findLast(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int lastPosition=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                lastPosition=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return lastPosition;
    }
    public static int findfirst(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int firstPosition=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                firstPosition=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return firstPosition;
    }
}