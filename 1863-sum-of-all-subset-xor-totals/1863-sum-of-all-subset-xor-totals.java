class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }

    private static int helper(int[] nums, int i, int xor) {
        if(i==nums.length) return xor;
        int take = helper(nums,i+1, xor^nums[i]);
        int ignore = helper(nums, i+1,xor);
        return take+ignore;
    }

}