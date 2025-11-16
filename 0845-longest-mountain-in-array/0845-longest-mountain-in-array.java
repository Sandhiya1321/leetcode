class Solution {
    public int longestMountain(int[] arr) {
        int len=arr.length;
        int maxLen=0;
        int i=1;
        while(i<len-1){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                int left = i - 1;
                int right = i + 1;
                while(left>0&&arr[left-1]<arr[left]){
                    left--;
                }
                while(right<len-1&&arr[right]>arr[right+1]){
                    right++;
                }
                maxLen = Math.max(maxLen, right - left + 1);
                i=right;
            }
            else{
                i++;
            }
        }
        return maxLen;
    }
}