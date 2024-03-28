class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int s=0, e=0, res = 0;
        while(e < nums.length){
            int num = nums[e];
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num, 1);
            
            while(map.get(num) > k){
                int n = nums[s];
                map.put(n, map.get(n)-1);
                s++;
            }
            res = Math.max(res, (e-s)+1);
            e++;
        }
        return res;
    }
}