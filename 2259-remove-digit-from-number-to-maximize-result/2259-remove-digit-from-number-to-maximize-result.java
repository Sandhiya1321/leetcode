class Solution {
    public String removeDigit(String number, char digit) {
        String result="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                String newStr=number.substring(0,i)+number.substring(i+1);
                if(newStr.compareTo(result)>0){
                    result=newStr;
                }
            }
           
        }
        return result;
    }
}