class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        bool monoInc = true;
        for(int i=0; i<nums.size()-1; i++){
            if(nums[i] > nums[i+1]){
                monoInc = false;
                break;
            }
        }
        if(monoInc) return true;
        for(int i=0; i<nums.size()-1; i++){
            if(nums[i] < nums[i+1]){
                return false;
            }
        }
        return true;
    }
};