class Solution {
    public String makeFancyString(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int length=res.length();
            if(length>=2&&res.charAt(length-1)==s.charAt(i)&&res.charAt(length-2)==s.charAt(i)) 
            continue;
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}