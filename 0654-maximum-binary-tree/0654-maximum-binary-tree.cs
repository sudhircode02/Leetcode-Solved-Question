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
    public TreeNode ConstructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.Length-1);
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