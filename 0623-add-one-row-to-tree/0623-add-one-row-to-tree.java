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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        helper(root, depth, 1, val);
        return root;
    }

    private void helper(TreeNode root, int depth, int currDepth, int val){
        if(root == null) return;
        if(currDepth == depth-1){
            TreeNode leftNode = new TreeNode(val);
            TreeNode rightNode = new TreeNode(val);
            leftNode.left = root.left;
            rightNode.right = root.right;
            root.left = leftNode;
            root.right = rightNode; 
            return;
        }
        helper(root.left, depth, currDepth+1, val);
        helper(root.right, depth, currDepth+1, val);
    }
}