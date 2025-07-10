class Solution {
    public int myAtoi(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int i=0;
        int n=s.length();
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        int dem=1;
        while(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            dem=s.charAt(i)=='-'?-1:1;
            i++;
             if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                return 0;
                }
        }
       

        long num=0;
        while(i<n&&Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            if (dem * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (dem * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int)(dem*num);
    }
}