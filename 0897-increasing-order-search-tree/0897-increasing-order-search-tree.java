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
    private TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dum=new TreeNode(0);
        cur=dum;
        inorder(root);
        return dum.right;
    }
    public void inorder(TreeNode root) {
        if(root==null) return;
        inorder(root.left);
        root.left=null;
        cur.right=root;
        cur=root;
        inorder(root.right);
    }
}