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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private TreeNode helper(int[] nums, int s, int e){
        if(s>e) return null;
        int mid = s;
        int max = nums[s];
        for(int i=s+1; i<=e; i++){
            if(nums[i] > nums[mid]){
                max = nums[i];
                mid = i;
            }
        }
        
        TreeNode node = new TreeNode(max);
        node.left = helper(nums, s, mid-1);
        node.right = helper(nums, mid+1, e);
        return node;
    }
}