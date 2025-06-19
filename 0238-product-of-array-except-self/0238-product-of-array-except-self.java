class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int totProd=1;
        int countZero=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countZero++;
                continue;
            }
            totProd*=nums[i];
        }
        for(int i=0;i<n;i++){
            if(countZero>1){
                res[i]=0;
            }
            else if(countZero==1){
                res[i]=(nums[i]==0)?totProd:0;
            }
            else{
                res[i]=totProd/nums[i];
            }
        }
        return res;
    }
}