class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int ans=0;
        
        for(int num:nums){
            if(num>max){
                ans=max;
                max=num;
            }else if(num>ans){
                ans=num;
            }
        }
        return (max-1)*(ans-1);
    }
}