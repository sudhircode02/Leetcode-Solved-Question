public class Solution {
    public int MinPairSum(int[] nums) {
        Array.Sort(nums);
        int max = 0;
        for(int i=0, j=nums.Length-1; i<j; i++,j--){
           max = (nums[i]+nums[j] <= max)? max : nums[i]+nums[j];
        }
        return max;
    }
}