class Solution {
    public void sortColors(int[] arr) {
        
        int[] freq = new int[3];
        for (int j : arr) freq[j]++;
        for(int i=0, j=0; i<freq.length; i++){
            while(freq[i]-- > 0){
                arr[j++] = i;
            }
        }
    }
}