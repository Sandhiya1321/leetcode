class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] hex="0123456789abcdef".toCharArray();
        StringBuilder hexa=new StringBuilder();
        while(num!=0&&hexa.length()<8){
            int rem=num&15;
            hexa.append(hex[rem]);
            num>>>=4;
        }
        return hexa.reverse().toString();
    }
}