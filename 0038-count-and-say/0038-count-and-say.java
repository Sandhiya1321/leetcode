class Solution {
    public String countAndSay(int n) {
       if(n<=0){
        return "";
       } 
       String res="1";
       for(int i=2;i<=n;i++){
        res=getNext(res);
       }
       return res;
        
    }
    public String getNext(String word){
        StringBuilder next=new StringBuilder();
        int count=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                count++;
            }
            else{
                next.append(count).append(word.charAt(i-1));
                count=1;
            }
        }
        
        next.append(count).append(word.charAt(word.length()-1));
        return next.toString();
    }
}