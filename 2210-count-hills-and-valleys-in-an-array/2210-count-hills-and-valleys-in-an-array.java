class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        int count=0;

        for(int i=1;i<list.size()-1;i++){
            int cur=list.get(i);
            int prev=list.get(i-1);
            int next=list.get(i+1);
            if((cur>prev&&cur>next)||(cur<prev&&cur<next)){
                count++;
            }

        }
        return count;
    }
}