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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1LeafNode = new ArrayList<>();
          getLeafNode(root1, root1LeafNode);
        List<Integer> root2LeafNode = new ArrayList<>();
        getLeafNode(root2, root2LeafNode);
        return root1LeafNode.equals(root2LeafNode);
    }

    private void getLeafNode(TreeNode root, List<Integer> list){
        if(root.left == root.right){
            list.add(root.val);
        }
        if(root.left !=null){
            getLeafNode(root.left, list);
        }
        if(root.right !=null){
            getLeafNode(root.right, list);
        }
    }
}