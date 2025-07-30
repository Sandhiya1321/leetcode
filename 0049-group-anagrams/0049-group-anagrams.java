class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String ans=new String(ch);
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(str);
        }
        return new ArrayList<>(map.values());
    }
}