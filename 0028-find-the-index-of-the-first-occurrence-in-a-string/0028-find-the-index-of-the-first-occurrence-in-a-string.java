class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int stackLen=haystack.length();
        int nedLen=needle.length();
        for(int i=0;i<=stackLen-nedLen;i++){
            if(haystack.substring(i,i+nedLen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}