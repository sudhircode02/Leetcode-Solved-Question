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
        List<List<Integer>> list = new ArrayList<>();
        helper(root, 0, targetSum, new ArrayList<Integer>(), list);
        return list;
    }

    private void helper(TreeNode root, int sum, int target, List<Integer> curr, List<List<Integer>> list){
        if(root == null) return;
        sum += root.val;
        curr.add(root.val);
        if(sum == target && root.left == root.right){
            list.add(new ArrayList<>(curr));
            curr.remove(curr.size() - 1); // Backtracking
            return;
        }
        helper(root.left, sum, target, curr, list);
        helper(root.right, sum, target, curr, list);
        curr.remove(curr.size() - 1); // Backtracking
    }

}