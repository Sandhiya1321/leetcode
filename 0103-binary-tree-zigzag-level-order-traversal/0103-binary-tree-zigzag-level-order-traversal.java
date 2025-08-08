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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;

        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean rev=false;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> ans=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                if(!rev){
                    TreeNode cur=queue.pollFirst();
                    ans.add(cur.val);
                    if(cur.left!=null) queue.addLast(cur.left);
                    if(cur.right!=null) queue.addLast(cur.right);
                }else{
                    TreeNode cur=queue.pollLast();
                    ans.add(cur.val);
                    if(cur.right!=null) queue.addFirst(cur.right);
                    if(cur.left!=null) queue.addFirst(cur.left);
                    }
            }
            rev=!rev; 
            res.add(ans);
        }
        return res;
    }
}