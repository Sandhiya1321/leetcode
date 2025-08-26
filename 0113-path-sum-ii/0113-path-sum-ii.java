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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        help(root,targetSum,new ArrayList<>(),ans);
        return ans;
    }
    void help(TreeNode root,int sum,List<Integer> path,List<List<Integer>> ans){
        if(root==null) return;
        path.add(root.val);
        sum-=root.val;

        if(root.left==null &&root.right==null &&sum==0){
            ans.add(new ArrayList<>(path));
        }else{
            help(root.left,sum,path,ans);
            help(root.right,sum,path,ans);
        }
        path.remove(path.size()-1);
    }
}