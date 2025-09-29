class Solution {
    public int[] constructTransformedArray(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
        if (nums[i] != 0) {
            int targetIndex = (i + nums[i] + n) % n;
            result[i] = nums[targetIndex];
        } else {
            result[i] = 0;
        }
    }
    return result;
}    
}