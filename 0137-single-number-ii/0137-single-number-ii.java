class Solution {
    public int singleNumber(int[] nums) {
        int one=0;
        int count=0;
        for (int num : nums) {
            one ^= num&~count;
            count^=num&~one;
        }        
        return one;
    }
}