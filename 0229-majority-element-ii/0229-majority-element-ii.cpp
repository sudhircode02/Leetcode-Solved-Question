class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> list;
        int n = nums.size()/3;
        int x = INT_MIN;
        for(int i=0; i<nums.size(); i++){
            if(nums[i] == x) continue;
            int count = 1;
            int s = i+1;
            int e = nums.size()-1;
            while(s<=e){
                if((s==e && nums[s]==nums[i]) || (nums[s]==nums[i])){
                    nums[s] = x;
                    count++;
                }
                if (s!=e && nums[e]==nums[i]){
                    count++;
                    nums[e] = x;
                }
                s++;
                e--;
            }
            if(count > n) list.push_back(nums[i]);
        }
        return list;
    }
};