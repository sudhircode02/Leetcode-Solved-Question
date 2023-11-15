public class Solution {
    public int MaximumElementAfterDecrementingAndRearranging(int[] arr) {
        Array.Sort(arr);
        if(arr[0] != 1) arr[0] = 1;
        int max = 1;
        for(int i=1; i<arr.Length; i++){
            int diff = Math.Abs(arr[i]-arr[i-1]);
            if(diff > 1){
                arr[i] = arr[i-1]+1;
            }
            max = Math.Max(max, arr[i]);
        }
        return max;
    }
}