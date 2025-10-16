class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean neg = num < 0;
        num = Math.abs(num);
        StringBuilder str=new StringBuilder();
        while(num>0){
            int rem=num%7;
            str.append(String.valueOf(rem));
            num/=7;
        }
        if(neg) str.append("-");
        return str.reverse().toString();
    }
}