class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<3) return false;
        int i=0;
        while(i<n-1  &&  nums[i]<nums[i+1]){
            i++;
        }
        if(i==0) return false;

        int j=i;
        while(j<n-1&&nums[j]>nums[j+1]){
            j++;
        }
        if(j==i) return false;

        int k=j;
        while(k<n-1&&nums[k]<nums[k+1]){
            k++;
        }
        if(k==j) return false;

        for(int m=k;m<n-1;m++){
            if(nums[m]>=nums[m+1]){
                return false;
            }
        }
        return true;
    }
}
