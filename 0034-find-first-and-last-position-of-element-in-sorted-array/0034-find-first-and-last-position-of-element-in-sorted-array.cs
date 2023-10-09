public class Solution {
    public int[] SearchRange(int[] nums, int target) {
        
        if(nums.Length==1 && nums[0]==target){
            return new int[]{0,0};
        }

        int first = binarySearch(nums, target, true);
        if(first == -1){
            return new int[]{-1, -1};
        }
        int last = binarySearch(nums, target, false);
        return new int[]{first, last};
    }

    private int binarySearch(int[] nums, int target, bool firstPositionSearch){
        int ans = -1;
        int len = nums.Length;
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
}