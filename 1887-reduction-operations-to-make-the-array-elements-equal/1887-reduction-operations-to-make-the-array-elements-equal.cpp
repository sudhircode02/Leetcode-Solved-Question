class Solution {
public:
    int reductionOperations(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int opr = 0;
        int i=1;
        int res =0;
        while(i<nums.size()){
            if(nums[i] == nums[i-1]){
                res += opr;
            }
            else{
                opr++;
                res += opr;
            }
            i++;
        }
        return res;
    }
};