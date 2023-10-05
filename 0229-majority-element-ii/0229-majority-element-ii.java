class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        int x = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x) continue;
            int count = 1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    nums[j] = x;
                }
            }
            if(count > n) list.add(nums[i]);
        }
        return list;
    }
}