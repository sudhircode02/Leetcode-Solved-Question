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
    int res = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        helper(root, "");
        return res;
    }
    
    private void helper(TreeNode root, String sum){
        if(root == null) return;
        sum = sum+""+root.val;
        if(root.left == root.right) res += Integer.parseInt(sum);
        helper(root.left, sum);
        helper(root.right, sum);
    }
}