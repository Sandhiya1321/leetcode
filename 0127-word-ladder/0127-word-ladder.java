class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        int lev=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String word=queue.poll();
                char[] chars=word.toCharArray();
                for(int j=0;j<chars.length;j++){
                    char origi=chars[j];
                    for(char ch='a';ch<='z';ch++){
                        if(ch==origi) continue;
                        else
                        chars[j]=ch;
                        String newWord=new String(chars);
                        if(newWord.equals(endWord)) return lev+1;
                        if(set.contains(newWord)){
                            queue.offer(newWord);
                            set.remove(newWord);
                        }
                    }
                    chars[j]=origi;
                }
            }
            lev++;
        }
        return 0;
    }
}