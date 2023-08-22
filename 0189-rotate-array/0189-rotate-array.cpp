class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int len = nums.size();
        if(k==0 || k==len) return;
        while(k >= len){
            k -= len;
        }
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }
    
    void reverse(vector<int>& nums, int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
};