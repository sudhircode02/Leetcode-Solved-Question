public class Solution {
    public int GetLastMoment(int n, int[] left, int[] right) {
        int lastMoment = 0;
        for(int i=0; i<left.Length; i++){
            lastMoment = Math.Max(lastMoment, left[i]);
        }
        for(int i=0; i<right.Length; i++){
            lastMoment = Math.Max(lastMoment, n-right[i]);
        }
        return lastMoment;
    }
}