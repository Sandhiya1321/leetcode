class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] sb=text.split(" ");
        int count=0;

        boolean[] ans=new boolean[26];

        for(char ch:brokenLetters.toCharArray()){
            ans[ch-'a']=true;
        }

        for(String word:sb){
            boolean type=true;
            for(char ch:word.toCharArray()){
                if(ans[ch-'a']){
                    type=false;
                    break;
                }
            }
            if(type){
                count++;
            }
        }
        return count;
    }
}