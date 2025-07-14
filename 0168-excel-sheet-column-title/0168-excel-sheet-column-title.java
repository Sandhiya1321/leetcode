class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            char let=(char)('A'+rem);
            res.insert(0,let);
            columnNumber/=26;
        }
        return res.toString();
    }
}