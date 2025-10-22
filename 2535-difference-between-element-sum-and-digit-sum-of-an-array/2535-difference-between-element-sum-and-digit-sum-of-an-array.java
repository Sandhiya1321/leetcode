class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dsum=0;
        for(int i:nums){
            sum+=i;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                dsum+=rem;
                temp/=10;
            }
        }
        return sum-dsum;
    }
}