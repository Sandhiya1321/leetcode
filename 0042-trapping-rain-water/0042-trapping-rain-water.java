class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] water=new int[n];
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        int tot=0;
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        for(int j=n-2;j>=0;j--){
            rightmax[j]=Math.max(rightmax[j+1],height[j]);
        }
        for(int i=0;i<n;i++){
            water[i]=Math.min(leftmax[i],rightmax[i])-height[i];
            tot+=water[i];
        }
        return tot;      
    }
}