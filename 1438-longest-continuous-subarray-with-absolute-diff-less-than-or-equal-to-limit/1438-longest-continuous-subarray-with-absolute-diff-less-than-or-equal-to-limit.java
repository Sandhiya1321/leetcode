class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max=new LinkedList<>();
        Deque<Integer> min=new LinkedList<>();
        int left=0;
        int res=0;

        for(int i=0;i<nums.length;i++){
            while(!max.isEmpty()&&nums[i]>max.peekLast()){
                max.pollLast();
            }
            max.offerLast(nums[i]);


            while(!min.isEmpty()&&nums[i]<min.peekLast()){
                min.pollLast();
            }
            min.offerLast(nums[i]);
            while(!max.isEmpty()&&!min.isEmpty()&&max.peekFirst()-min.peekFirst()>limit){
                if(max.peekFirst()==nums[i]){
                    max.pollFirst();
                }
                if(min.peekFirst()==nums[i]){
                    min.pollFirst();
                }
                left++;
            }
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}