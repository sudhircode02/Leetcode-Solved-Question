class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq = new int[nums.length+1];
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            freq[num]++;
            if(freq[num] == 2) list.add(num);
        }
        return list;
    }
}