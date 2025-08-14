class Solution {
    public String largestGoodInteger(String num) {
        String max="";
        for(int i=0;i<=num.length()-3;i++){
            char ch1=num.charAt(i);
            char ch2=num.charAt(i+1);
            char ch3=num.charAt(i+2);
            if(ch1==ch2&&ch2==ch3){
                String same=num.substring(i,i+3);
                if(max.isEmpty()||same.compareTo(max)>0){
                    max=same;
                }
            }
        }
        return max;
    }
}