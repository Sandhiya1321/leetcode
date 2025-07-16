class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (even(num)) {
                sum++;
            }
        }
        return sum;
    }

    public int digit(int nums) {
        if (nums == 0) {
            return nums * -1;
        }
        if (nums == 0) {
            return 1;
        }
        int count = 0;
        while (nums > 0) {
            count++;
            nums = nums / 10;
        }
        return count;
    }

    boolean even(int count) {
        int num = digit(count);
        return num % 2 == 0;
    }
}