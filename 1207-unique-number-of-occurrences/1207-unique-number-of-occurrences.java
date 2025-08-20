class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        Set<Integer> res=new HashSet<>();
        for(int fre:freq.values()){
            if(!res.add(fre)){
                return false;
            }
        }
        return true;
    }
}