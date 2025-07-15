class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alpha=new boolean[26];
        for(char ch:sentence.toCharArray()){
            alpha[ch-'a']=true;
        }
        for(boolean let:alpha){
            if(!let){
                return false;
            }
        }
        return true;
    }
}