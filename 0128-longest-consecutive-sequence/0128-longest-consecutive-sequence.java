class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;  // ✅ handle empty or null

        Arrays.sort(nums);  // ✅ sort the array first
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // ✅ skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                count++;  // ✅ consecutive number found
            } else {
                count = 1; // ✅ sequence broken, reset
            }
            maxCount = Math.max(maxCount, count); // ✅ track maximum sequence length
        }

        return maxCount;
    }
}