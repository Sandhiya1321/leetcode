class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        String newString="";
        for(int i=words.length-1;i>=0;i--){
            newString=newString+words[i];
            if(i!=0){
                newString+=" ";
            }
        }        
        return newString;
    }
}
