class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
        vector<std::vector<int>> temp;
    int count = 0;
    for (int i = 0; i < nums.size(); i++) {
        int len = nums[i].size();
        if (len + i > temp.size()) {
            while ((len + i) - temp.size() > 0) {
                temp.push_back(vector<int>());
            }
        }
        int index = i;
        for (int j = 0; j < len; j++) {
            temp[index++].push_back(nums[i][j]);
        }
        count += len;
    }
    int index = 0;
    vector<int> res(count);
    for (std::vector<int>& row : temp) {
        for (int i = row.size() - 1; i >= 0; i--) {
            res[index++] = row[i];
        }
    }
    return res;
    }
};