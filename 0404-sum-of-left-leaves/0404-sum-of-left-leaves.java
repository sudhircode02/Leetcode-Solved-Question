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
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, 'c');
    }

    private int helper(TreeNode root, char ch){
        if(root == null) return 0;
        int sum = 0;
        sum += helper(root.left, 'l');
        if(root.left == root.right && ch=='l') sum += root.val;
        sum += helper(root.right, 'r');
        return sum;
    }
}