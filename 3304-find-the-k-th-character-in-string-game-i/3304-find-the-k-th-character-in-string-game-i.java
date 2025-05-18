class Solution {
    public char kthCharacter(int k) {
       return longest("a",k).charAt(k-1);
    }
    public String longest(String word,int k){
        if(word.length()>=k){
            return word;
        }
        StringBuilder result=new StringBuilder();
        for(char c:word.toCharArray()){
            result.append((char)((c-'a'+1)%26+'a'));
            }
            return longest(word+result.toString(),k);
    } 
}