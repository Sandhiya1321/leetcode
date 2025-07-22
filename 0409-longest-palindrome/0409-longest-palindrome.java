class Solution {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0) return 0;

        int max=0;
        for(int i=0;i<s.length();i++){
            int len1=palindrome(s,i,i);
            int len2=palindrome(s,i,i+1);
            int val=Math.max(len1,len2);
            max=Math.max(max,val);
        }
        return max;
    }
    public int palindrome(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}