class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        long sum = 0;
        for(int num : nums) sum += num;
        for(int i = nums.size() - 1; i > 1; i--){
            if(sum - nums[i] > nums[i]) return sum;
            sum -= nums[i];
        }
        return -1;
    }
};