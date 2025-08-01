class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1count=new int[26];
        int[] s2count=new int[26];
        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }
        for(int i=s1.length();i<s2.length();i++){
            if(permute(s1count,s2count)) return true;

            s2count[s2.charAt(i-s1.length())-'a']--;
            s2count[s2.charAt(i)-'a']++;
        }
        return permute(s1count,s2count);
    }
    private boolean permute(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}