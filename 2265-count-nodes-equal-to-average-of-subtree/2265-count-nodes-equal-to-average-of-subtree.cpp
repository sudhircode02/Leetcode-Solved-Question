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
private :
    int count = 0;
        
    struct Info{
        int sum;
        int nodeCount;
        Info(int s, int n) : sum(s), nodeCount(n) {}
    };
        
    Info helper(TreeNode* root){
        if(root == NULL){
            return Info(0,0);
        }
        Info left = helper(root->left);
        Info right = helper(root->right);
        int sum = left.sum + right.sum + root->val;
        int nodeCount = left.nodeCount + right.nodeCount + 1;
        if ((sum / nodeCount) == root->val) {
            count++;
        }
        return Info(sum, nodeCount);
    }
    
    
public:
    int averageOfSubtree(TreeNode* root) {
        helper(root);
        return count;
    }
};