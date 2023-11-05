
class Solution {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        int winCount  = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                winCount = 0;
            }
            winCount++;
            if(winCount >= k) break;
        }
        return max;
    }
}
