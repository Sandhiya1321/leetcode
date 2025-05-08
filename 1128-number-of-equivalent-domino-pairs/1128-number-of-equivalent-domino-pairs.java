class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        int count=0;
        for(int[] domino:dominoes){
            int key=Math.min(domino[0],domino[1])*10+Math.max(domino[0],domino[1]);
            ans.put(key,ans.getOrDefault(key,0)+1);
        }
        for(int occ:ans.values()){
            count+=(occ*(occ-1))/2;
        }
        return count;
    }
}