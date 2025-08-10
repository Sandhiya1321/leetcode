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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue=new LinkedList<>();
        Map<Integer,TreeNode> map=new HashMap<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            boolean foundx=false;
            boolean foundy=false;
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                if(cur.left!=null){
                    queue.offer(cur.left);
                    map.put(cur.left.val,cur);
                    if(cur.left.val==x) foundx=true;
                    if(cur.left.val==y) foundy=true;
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                    map.put(cur.right.val,cur);
                    if(cur.right.val==x) foundx=true;
                    if(cur.right.val==y) foundy=true;
                }
            }
            if(foundx&&foundy) return map.get(x)!=map.get(y);
            if(foundx||foundy) return false;
        }
        return false;
    }
}