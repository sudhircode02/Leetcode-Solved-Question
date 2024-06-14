class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int inc = 1 + nums[i-1] - nums[i];
                res += inc;
                nums[i] += inc;
            }
        }
        return res;
    }
}