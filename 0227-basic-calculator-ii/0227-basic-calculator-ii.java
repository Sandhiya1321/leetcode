class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num=0;
        char oper='+';
       
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
             if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
           
            if(!Character.isDigit(ch)&&ch!=' '||i==s.length()-1){
            switch(oper){
                case '+':
                stack.push(num);
                break;
                case '-':
                stack.push(-num);
                break;
                case '*':
                stack.push(stack.pop()*num);
                break;
                case '/':
                stack.push(stack.pop()/num);
                break;
            }
            oper=ch;
            num=0;
        }
        int res=0;
        for(int val:stack){
            res+=val;
        }
        return res;
    }
}