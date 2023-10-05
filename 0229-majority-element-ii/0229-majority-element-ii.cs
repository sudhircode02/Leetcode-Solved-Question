public class Solution {
    public IList<int> MajorityElement(int[] nums) {
        List<int> list = new List<int>();
        int n = nums.Length / 3;
        int x = int.MinValue;
        for (int i = 0; i < nums.Length; i++){
            if (nums[i] == x) continue;
            int count = 1;
            int s = i + 1;
            int e = nums.Length - 1;
            while (s <= e){
                if ((s == e && nums[s] == nums[i]) || (nums[s] == nums[i])){
                    nums[s] = x;
                    count++;
                }
                if (s != e && nums[e] == nums[i]){
                count++;
                nums[e] = x;
                }
                s++;
                e--;
            }
            if (count > n) list.Add(nums[i]);
        }   
        return list;
    }
}