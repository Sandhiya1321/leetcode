class Solution {
    public List<String> commonChars(String[] words) {
        int[] min=new int[26];
        Arrays.fill(min,Integer.MAX_VALUE);

        for(String word:words){
            int[] freq=new int[26];
            for(char c:word.toCharArray()){
                freq[c-'a']++;
            }
            for(int i=0;i<26;i++){
                min[i]=Math.min(min[i],freq[i]);
            }
        }
        List<String> res=new ArrayList<>();
        for(int i=0;i<26;i++){
            for(int j=0;j<min[i];j++){
                res.add(String.valueOf((char)(i+'a')));
            }
        }
        return res;
    }
}