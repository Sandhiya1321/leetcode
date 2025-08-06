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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        if(root==null) return res;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> curlev=new ArrayList<>(queue.size());
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                curlev.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            res.add(curlev);
        }
        return res;
    }
}