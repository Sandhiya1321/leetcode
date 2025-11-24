class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int num=0;
        for(int i=0;i<nums.length;i++){
           num=((num<<1)+nums[i])%5;
           ans.add(num==0);
        }
        return ans;
    }
}
