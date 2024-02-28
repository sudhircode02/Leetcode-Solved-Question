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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>());
        int idx = 0;
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node == null){
                if(!queue.isEmpty()){
                    idx++;
                    list.add(new ArrayList<Integer>());
                    queue.add(null);
                }
            }
            else{
                list.get(idx).add(node.val);
                if(node.left !=null) queue.add(node.left);
                if(node.right !=null) queue.add(node.right);
            }
        }
        return list.get(idx).get(0);
    }
}