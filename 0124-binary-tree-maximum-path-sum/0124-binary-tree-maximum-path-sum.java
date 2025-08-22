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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        help(root);
        return ans;
    }
    int help(TreeNode root){
        if(root==null) return 0;
        int left=help(root.left);
        int right=help(root.right);

        left=Math.max(0,left);
        right=Math.max(0,right);
        int max=left+right+root.val;


        ans=Math.max(ans,max);
        return Math.max(left,right)+root.val;
    }
}