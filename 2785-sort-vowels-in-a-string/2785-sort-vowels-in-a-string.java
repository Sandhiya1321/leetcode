class Solution {
    public String sortVowels(String s) {
        String vow="aeiouAEIOU";
        List<Character> list=new ArrayList<>();
        char[] chars=s.toCharArray();
        for(char c:chars){
            if(vow.indexOf(c)!=-1){
                list.add(c);
            }
        }
        Collections.sort(list);
        StringBuilder str=new StringBuilder();
        int vowInd=0;
        for(char c:chars){
            if(vow.indexOf(c)!=-1){
                str.append(list.get(vowInd++));
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }
}