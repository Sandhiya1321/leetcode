class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums2.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
           while(!stack.isEmpty()&&stack.peek()<nums2[i]){
            stack.pop();
           }
           ans[i]=stack.isEmpty()?-1:stack.peek();
           stack.push(nums2[i]);
        }
           int[] res=new int[nums1.length];
           for(int j=0;j<nums1.length;j++){
            for(int k=0;k<nums2.length;k++){
                if(nums1[j]==nums2[k]){
                    res[j]=ans[k];
                }
            }
           }
        return res;
    }
}