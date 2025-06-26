class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] hex="0123456789abcdef".toCharArray();
        StringBuilder hexa=new StringBuilder();
        while(num>0){
            int rem=num%16;
            hexa.append(hex[rem]);
            num=num/16;
        }
        return hexa.reverse().toString();
    }
}