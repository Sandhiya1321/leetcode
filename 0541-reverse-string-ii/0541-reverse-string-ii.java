class Solution {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();

        for(int i=0;i<s.length();i+=2*k){
            int m=i;
            int n=Math.min(i+k-1,s.length()-1);
            while(m<n){
                char temp=ch[m];
                ch[m]=ch[n];
                ch[n]=temp;
                m++;
                n--;
            }
        }
        return new String(ch);
    }
}