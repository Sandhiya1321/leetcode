class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            if (i != zero) { 
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
            }
            zero++;
        }
    }
    }
}