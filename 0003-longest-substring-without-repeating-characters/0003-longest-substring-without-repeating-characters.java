class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> ans=new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            if(ans.containsKey(s.charAt(i))){
                left=Math.max(left,ans.get(s.charAt(i))+1);
            }
            ans.put(s.charAt(i),i);
            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}