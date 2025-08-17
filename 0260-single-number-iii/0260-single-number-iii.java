class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int dif=xor & (-xor);
        int a=0;
        int b=0;
        for(int num:nums){
            if((num & dif)==0){
                a^=num;
            }else{
                b^=num;
            }
        }
        return new int[]{a,b};
    }
}