class Solution {
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            return new ArrayList<>();
        } 
        
        String[] phoneLetters = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        tracking(result, new StringBuilder(), digits, phoneLetters, 0);
        return result;
    }

    private static void tracking(List<String> result, StringBuilder current, 
                                  String digits, String[] phoneLetters, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneLetters[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            tracking(result, current, digits, phoneLetters, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

} 
