class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!stack.isEmpty()){
                    sb.append(ch);
                }
                stack.push(ch);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}