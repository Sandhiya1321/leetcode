class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0 ){
            return "";

        }
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;     
}
}