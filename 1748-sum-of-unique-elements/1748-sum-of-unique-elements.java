class Solution {
    public int sumOfUnique(int[] nums) {
     Map<Integer,Integer> frq=new HashMap<>();

        for(int num:nums){
            frq.put(num,frq.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int num:frq.keySet()){
            if(frq.get(num)==1){
                sum+=num;
            }
        }  
        return sum; 
    }
}