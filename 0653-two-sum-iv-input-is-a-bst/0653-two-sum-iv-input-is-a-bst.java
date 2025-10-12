/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list =new ArrayList<>();
        inorder(root,list);
        int sum=0;
        int left=0;
        int right=list.size()-1;
        while(left<right){
            sum=list.get(left)+list.get(right);
            if(sum==k) return true;
            else if(sum<k) left++;
            else right--;
        }
        return false;
    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}