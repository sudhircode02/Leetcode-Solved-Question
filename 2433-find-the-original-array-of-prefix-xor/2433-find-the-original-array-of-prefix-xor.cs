public class Solution {
    public int[] FindArray(int[] pref) {
        int[] ans =new int[pref.Length];
        ans[0]=pref[0];
        for(int i=1; i<pref.Length; i++){
            ans[i] = pref[i]^pref[i-1];
        }
        return ans;
    }
}