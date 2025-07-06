

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        // Step 1: Find two potential candidates
        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;

        for (int num : nums) {
            if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            } else if (count1 == 0) {
                element1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                element2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify actual frequencies
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == element1) count1++;
            else if (num == element2) count2++;
        }

        if (count1 > n / 3) result.add(element1);
        if (count2 > n / 3) result.add(element2);

        return result;
    }
}