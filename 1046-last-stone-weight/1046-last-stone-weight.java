class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            max.add(stone);
        }
        while(max.size()>1){
            int stone1=max.poll();
            int stone2=max.poll();
            if(stone1!=stone2){
                max.add(stone1-stone2);
            }
        }
        return max.isEmpty()?0:max.poll();       
    }
}