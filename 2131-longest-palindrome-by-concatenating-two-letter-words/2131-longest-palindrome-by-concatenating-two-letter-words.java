class Solution {
    public int longestPalindrome(String[] words) {
        int length=0;
        boolean centre=false;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(new StringBuilder(words[j]).reverse().toString())){
                    length+=4;
                    words[i]=words[j]="";
                }
            }
            for(String word:words){
                if(word.length()==2&&word.charAt(0)==word.charAt(1)){
                    centre=true;
                    break;
                }
            }
        }
        if(centre){
                length+=2;
            }
         return length;
    }
}
