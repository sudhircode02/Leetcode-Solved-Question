class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int[] freq = new int[1001];
        for(int num : arr1) freq[num]++;
        int i=0;
        for(int num : arr2){
            while(freq[num]-- > 0)  res[i++] = num;  
        }
        for(int j=0; j<freq.length; j++){
            while(freq[j]-- > 0)    res[i++]=j;
        }
        return res;
    }
}