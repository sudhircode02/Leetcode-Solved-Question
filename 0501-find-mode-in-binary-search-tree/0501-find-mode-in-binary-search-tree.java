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
    Map<Integer, Integer> map;
    public int[] findMode(TreeNode root) {
        map = new HashMap<>();
        traverse(root);
        int maxFreq = -1;
        List<Integer> temp = new ArrayList<>();
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > maxFreq){
                temp.clear();
                temp.add(key);
                maxFreq = freq;
            }
            else if(freq == maxFreq) temp.add(key);
        }
        int[] modes = new int[temp.size()];
        for(int i=0; i<modes.length; i++){
            modes[i] = temp.get(i);
        }
        return modes;
    }

    public void traverse(TreeNode node){
        if(node == null) return;
        if(map.containsKey(node.val)) map.put(node.val, map.get(node.val)+1);
        else map.put(node.val, 1);
        traverse(node.left);
        traverse(node.right);
    }
    
}