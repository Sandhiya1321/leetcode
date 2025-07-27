class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);

        int m=nums1.length;
        int n=nums2.length;
        int low=0;
        int high=m;
        while(low<=high){
            int i=(low+high)/2;
            int j=(m+n+1)/2-i;

            int max1=(i==0)?Integer.MIN_VALUE:nums1[i-1];
            int min1=(i==m)?Integer.MAX_VALUE:nums1[i];

            int max2=(j==0)?Integer.MIN_VALUE:nums2[j-1];
            int min2=(j==n)?Integer.MAX_VALUE:nums2[j];

            if(max1 < min2 && max2 <min1){
                if((m+n)%2==0){
                    return (Math.max(max1,max2)+Math.min(min1,min2))/2.0;
                }else{
                    return Math.max(max1,max2);
                }
            }else if(max1>min2){
                high=i-1;
            }else{
                low=i+1;
            }
        }
        return 0.0; 
    }
}