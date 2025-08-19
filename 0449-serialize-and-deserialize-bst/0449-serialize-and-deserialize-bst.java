/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        help(root,sb);
        return sb.toString();
    }
    void help(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        help(root.left,sb);
        help(root.right,sb);
        }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] res=data.split(",");
        Queue<String> ans=new LinkedList<>(Arrays.asList(res));
        return helpD(ans);
    }
    TreeNode helpD(Queue<String> queue){
        String node=queue.poll();
        if("null".equals(node)) return null;
        TreeNode ans=new TreeNode(Integer.parseInt(node));
        ans.left=helpD(queue);
        ans.right=helpD(queue);
        return ans;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;