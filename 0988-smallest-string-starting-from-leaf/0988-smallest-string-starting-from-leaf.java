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
     private String smallest = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return smallest;
    }

    public void dfs(TreeNode node, StringBuilder sb) {

        if(node == null)
            return;

        char nodeChar = (char) ('a' + node.val);
        sb.append(nodeChar);
        if(node.right == null && node.left == null) { //leaf node
            //System.out.println(sb.toString());
            String cur = new StringBuilder(sb).reverse().toString();            
           if(smallest == null || smallest.compareTo(cur) > 0) {
                    smallest = cur;
            }
        } else {
            dfs(node.left, sb);
            dfs(node.right, sb);          
        }
        
        sb.setLength(sb.length()-1);
    }
}