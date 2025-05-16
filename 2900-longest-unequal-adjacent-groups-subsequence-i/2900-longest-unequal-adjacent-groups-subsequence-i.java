class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> lst=new ArrayList<>();
        lst.add(words[0]);
        int pre=groups[0];
        for(int i=0;i<words.length;i++){
            if(groups[i]!=pre){
                lst.add(words[i]);
                pre=groups[i];
            }
        }
        return lst;
    }
}