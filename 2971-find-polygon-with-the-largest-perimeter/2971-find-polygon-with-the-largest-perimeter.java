class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum =0;
        for(int num : nums) sum += num;
        for(int i=nums.length-1; i>1; i--){
            if(sum - nums[i] > nums[i]) return sum;
            sum -= nums[i];
        }
        return -1;
    }
}