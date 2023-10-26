/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
        return helper(nums, 0, nums.size()-1);
    }

    TreeNode* helper(vector<int>& nums, int s, int e){
        if(s>e) return NULL;
        int mid = s;
        int max = nums[s];
        for(int i=s+1; i<=e; i++){
            if(nums[i] > nums[mid]){
                max = nums[i];
                mid = i;
            }
        }
        
        TreeNode* node = new TreeNode(max);
        node->left = helper(nums, s, mid-1);
        node->right = helper(nums, mid+1, e);
        return node;
    }
};