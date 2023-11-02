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
    private int count = 0;
    private static class Info{
        int sum;
        int nodeCount;
        public Info(int sum, int nodeCount){
            this.sum = sum;
            this.nodeCount = nodeCount;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        helper(root); 
        return count;
    }
    private Info helper(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        Info left = helper(root.left);
        Info right = helper(root.right);
        int sum = left.sum+ right.sum + root.val;
        int nodeCount = left.nodeCount + right.nodeCount + 1;
        if((sum/nodeCount) == root.val) count++;
        return new Info(sum, nodeCount);
    }
}























