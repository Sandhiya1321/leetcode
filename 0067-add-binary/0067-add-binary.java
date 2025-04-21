class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;

        while(i>=0||j>=0||carry>0){
            int A=(i>=0)?a.charAt(i--) - '0':0;
            int B=(j>=0)?b.charAt(j--) - '0':0;
            int sum=A+B+carry;
            res.append(sum%2);
            carry=sum/2;
            
            
        }
        return res.reverse().toString();
    }
}