class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            return helpfun(s,'a','b',x,y);
        }else{
            return helpfun(s,'b','a',y,x);
        }
    }
    private int helpfun(String s,char one,char two,int onep,int twop){
        Stack<Character> stack=new Stack<>();
        int point=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty()&&stack.peek()==one&&ch==two){
                stack.pop();
                point+=onep;
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        stack.clear();
        s=sb.reverse().toString();
       

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty()&&stack.peek()==two&&ch==one){
                stack.pop();
                point+=twop;
            }else{
                stack.push(ch);
            }
        }
        return point;
    }
}