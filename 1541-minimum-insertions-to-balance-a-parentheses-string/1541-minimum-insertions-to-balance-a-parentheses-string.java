public class Solution {
    public int minInsertions(String s) {
        int insertions = 0;     // Total insertions needed
        int rightNeeded = 0;    // Number of ')' needed to complete existing '('

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                rightNeeded += 2;

                // If rightNeeded is odd, insert one ')' to make it even
                if (rightNeeded % 2 == 1) {
                    insertions++;
                    rightNeeded--; // We've "inserted" one ')', so reduce need
                }
            } else { // Current char is ')'
                rightNeeded--;

                if (rightNeeded < 0) {
                    // Too many ')', need to insert one '('
                    insertions++;
                    rightNeeded = 1; // Because we just saw one ')', still need one more
                }
            }
        }

        // If there are still ')' needed to match earlier '(', add insertions
        return insertions + rightNeeded;
    }
