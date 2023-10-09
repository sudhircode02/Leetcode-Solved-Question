class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans;
        if(nums.size()==1 && nums[0]==target){
            ans.push_back(0);
            ans.push_back(0);
            return ans;
        }

        int first = binarySearch(nums, target, true);
        if(first == -1){
            ans.push_back(-1);
            ans.push_back(-1);
            return ans;
        }
        int last = binarySearch(nums, target, false);
        ans.push_back(first);
        ans.push_back(last);
        return ans;
    }

    int binarySearch(vector<int>& nums, int target, bool firstPositionSearch){
        int ans = -1;
        int len = nums.size();
        if(len==0) return ans;
        int s = 0;
        int e = len-1;
        while(s <= e){
            int mid = s+(e-s)/2;

            if(nums[mid] < target){
                s = mid+1;
            }
            else if(nums[mid] > target){
                e = mid-1;
            }
            else{
                ans = mid;
                if(firstPositionSearch){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }
};