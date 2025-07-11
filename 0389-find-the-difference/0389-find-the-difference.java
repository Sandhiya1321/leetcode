class Solution {
    public char findTheDifference(String s, String t) {
        int dif=0;
        for(char ch:s.toCharArray()){
            dif^=ch;
        }
        for(char ch:t.toCharArray()){
            dif^=ch;
        }
        return (char) dif;
    }
}