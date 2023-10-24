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
    vector<int> largestValues(TreeNode* root) {
        vector<int> list;
        if(root==NULL) return list;
        queue<TreeNode*> queue;
        queue.push(root);
        queue.push(NULL);
        int max = INT_MIN;
        while(!queue.empty()){
            TreeNode* currNode = queue.front();
            queue.pop();
            if(currNode == NULL){
                list.push_back(max);
                max = INT_MIN;
                if(!queue.empty()){
                    queue.push(NULL);
                }
            }
            else{
                max =  std::max(currNode->val , max);
                if(currNode->left != NULL) queue.push(currNode->left);
                if(currNode->right != NULL) queue.push(currNode->right);
            }
        }
        return list;
    }
};