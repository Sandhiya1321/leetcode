class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            char lower = ch;
            char upper = Character.toUpperCase(ch);

            int lastLower = word.lastIndexOf(lower);
            int firstUpper = word.indexOf(upper);
            if (lastLower != -1 && firstUpper != -1) {
                if (lastLower < firstUpper) {
                    count++;
                }
            }
        }
        return count;
    }
}