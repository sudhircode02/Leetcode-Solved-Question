class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        int x = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x) continue;
            int count = 1;
            int s = i+1;
            int e = nums.length-1;
            while(s<=e){
                if((s==e && nums[s]==nums[i]) || (nums[s]==nums[i])){
                    nums[s] = x;
                    count++;
                }
                if (s!=e && nums[e]==nums[i]){
                    count++;
                    nums[e] = x;
                }
                s++;
                e--;
            }
            if(count > n) list.add(nums[i]);
        }
        return list;
    }
}