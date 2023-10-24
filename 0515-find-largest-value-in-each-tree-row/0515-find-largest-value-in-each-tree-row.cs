/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public IList<int> LargestValues(TreeNode root) {
        List<int> list = new List<int>();
        if(root==null) return list;
        Queue<TreeNode> queue = new Queue<TreeNode>();
        queue.Enqueue(root);
        queue.Enqueue(null);
        int max = int.MinValue;
        while(queue.Count > 0){
            TreeNode currNode = queue.Dequeue();
            if(currNode == null){
                list.Add(max);
                max = int.MinValue;
                if(queue.Count > 0){
                    queue.Enqueue(null);
                }
            }
            else{
                max = Math.Max(currNode.val , max);
                if(currNode.left != null) queue.Enqueue(currNode.left);
                if(currNode.right != null) queue.Enqueue(currNode.right);
            }
        }
        return list;
    }
}