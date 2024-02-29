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

    public boolean isEvenOddTree(TreeNode root) {
        if(root.left == root.right){
            return root.val%2 == 0? false : true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<List<Integer>> list = new ArrayList<>();
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
        return validate(list);
    }

    private boolean validate(List<List<Integer>> list){
        //even
        for(int i=0; i<list.size(); i+=2){
            List<Integer> temp = list.get(i);
            for(int j=0; j<temp.size(); j++){
                if(temp.get(j)%2 == 0) return false;
                if(j>0 && temp.get(j) <= temp.get(j-1)) return false;
            }
        }
        //odd
        for(int i=1; i<list.size(); i+=2){
            List<Integer> temp = list.get(i);
            for(int j=0; j<temp.size(); j++){
                if(temp.get(j)%2 != 0) return false;
                if(j>0 && temp.get(j) >= temp.get(j-1)) return false;
            }
        }
        return true;
    }
}