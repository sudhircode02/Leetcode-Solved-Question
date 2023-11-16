class Solution {
public:
    string findDifferentBinaryString(vector<string>& nums) {
        int len = nums.size();
        int n = pow(2, len);
        vector<int> temp(n, 0);
        for (string s : nums) {
            int num = std::stoi(s, nullptr, 2);
            temp[num]++;
        }
        string ans = "";
        for (int i = n - 1; i >= 0; i--) {
            if (temp[i] == 0) {
                ans = std::bitset<32>(i).to_string().substr(32 - len);
                break;
            }
        }
        return ans;
    }
};