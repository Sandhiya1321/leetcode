class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        braces(list,"",0,0,n);
        return list;
    }
    public void braces(List<String> list,String cur,int open,int close,int max){
        if(cur.length()==max*2){
            list.add(cur);
            return;
        }
        if(open<max){
            braces(list,cur+"(",open+1,close,max);
        }
        if(close<open){
            braces(list,cur+")",open,close+1,max);
        }
    }
}