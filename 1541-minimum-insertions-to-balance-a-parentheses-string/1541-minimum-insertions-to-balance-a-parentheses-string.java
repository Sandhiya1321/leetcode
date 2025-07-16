class Solution {
    public int minInsertions(String s) {
        int close=0;
        int open=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open+=2;
                if(open%2==1){
                close++;
                open--;
            }
            }
            else{
                open--;
                if(open<0){
                    close++;
                    open+=1;
                }
            }
        }
        return close+open;
    }
}