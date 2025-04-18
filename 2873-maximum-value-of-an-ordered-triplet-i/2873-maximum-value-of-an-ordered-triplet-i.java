class Solution {
    public long maximumTripletValue(int[] nums) {
        int maxValue=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int triplet=(nums[i]-nums[j])*nums[k];
                    maxValue=Math.max(maxValue,triplet);
                }
            }

        }
        return Math.max(maxValue,0);
    }
}