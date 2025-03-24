class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String n=""; 
            for(int i=0;i<s.length();i+=k){
                String t=s.substring(i,Math.min(i+k,s.length()));   
                int sum=0;
                for(int l=0;l<t.length();l++){ 
                    sum+=t.charAt(l)-'0';
                }
                n+="" + sum;                 
            }
            s=n;
        }
        return s;
    }
}