class Solution {
public:
    int countNicePairs(vector<int>& nums) {
        int mod = 1000000007;
        int len =nums.size();
        for(int i=0; i<len; i++) nums[i] = nums[i] - rev(nums[i]);
        sort(nums.begin(), nums.end());
        long res = 0;
        for (int i = 0; i < len - 1; i++) {
            long count = 1;
            while (i < len - 1 && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
            res = (res % mod + (count * (count - 1)) / 2) % mod;
        }

        return (int) (res % mod);

    }

    int rev(int n){
        int ans = 0;
        while(n>0){
            ans = (ans*10)+(n%10);
            n/=10; 
        }
        return ans;
    }
};