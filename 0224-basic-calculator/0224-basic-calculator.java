class Solution {
    public int calculate(String s) {
               return evaluate(s.replaceAll(" ", ""), new int[]{0});
    }

    private int evaluate(String s, int[] index) {
        int result = 0;
        int sign = 1;
        int num = 0;

        while (index[0] < s.length()) {
            char ch = s.charAt(index[0]);

            if (Character.isDigit(ch)) {
                num = ch - '0';
                while (index[0] + 1 < s.length() && Character.isDigit(s.charAt(index[0] + 1))) {
                    num = num * 10 + (s.charAt(++index[0]) - '0');
                }
                result += sign * num;
                num = 0;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            } else if (ch == '(') {
                index[0]++;
                result += sign * evaluate(s, index);
            } else if (ch == ')') {
                break;
            }
            index[0]++;
        }

        return result;
    }
