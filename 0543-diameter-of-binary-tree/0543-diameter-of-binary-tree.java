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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia-1;
    }
    private int height(TreeNode node){
        if(node==null) return 0;

        int leftH=height(node.left);
        int rightH=height(node.right);
        int diameter=leftH+rightH+1;
        dia=Math.max(dia,diameter);

        return Math.max(leftH,rightH)+1;
    }
}