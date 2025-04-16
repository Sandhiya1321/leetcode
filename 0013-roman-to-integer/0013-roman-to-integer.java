class Solution {
    public int romanToInt(String s) {
        int prev=0;
        int result=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=getRoman(s.charAt(i));
            if(cur<prev){
                result=result-cur;
            }
            else{
                result=result+cur;
            }
            prev=cur;
        }
        return result;
     
    }
    private int getRoman(char ch){
        switch(ch){
            case 'I':
            return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return 0;
        }
    }
}