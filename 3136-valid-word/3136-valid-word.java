class Solution {
    public boolean isValid(String word) {
        if(word==null||word.length()<3){
            return false;
        }
        boolean vowel=false;
        boolean consonant=false;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            char lower=Character.toLowerCase(ch);
            if("aeiou".indexOf(lower)>=0){
                vowel = true;
            }else if(Character.isLetter(lower)) {
                consonant = true;
            }
        }
        return vowel && consonant;
    }
}