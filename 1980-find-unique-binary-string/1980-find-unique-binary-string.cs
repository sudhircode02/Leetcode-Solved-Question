public class Solution {
    public string FindDifferentBinaryString(string[] nums) {
        int len = nums.Length;
        int n = (int)Math.Pow(2, len);
        int[] temp = new int[n];
        foreach (string s in nums) {
            int num = Convert.ToInt32(s, 2);
            temp[num]++;
        }
        string ans = "";
        for (int i = n - 1; i >= 0; i--) {
            if (temp[i] == 0) {
                ans = Convert.ToString(i, 2);
                while (ans.Length < len) {
                    ans = '0' + ans;
                }
                break;
            }
        }
        return ans;
    }
}