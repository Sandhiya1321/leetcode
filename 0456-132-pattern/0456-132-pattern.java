class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        Stack<Integer> stack=new Stack<>();
        int pat=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<pat){
                return true;
            }
            while(!stack.isEmpty()&&nums[i]>stack.peek()){
                pat=stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}