class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");

        StringBuilder sb=new StringBuilder();
        for(String res:str){
            sb.append(new StringBuilder(res).reverse()).append(" ");
        }
        return sb.toString().trim();
    }
}