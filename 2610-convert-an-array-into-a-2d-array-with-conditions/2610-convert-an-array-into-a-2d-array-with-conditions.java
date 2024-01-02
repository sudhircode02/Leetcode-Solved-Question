class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[201];
        int highFreq = 0;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            freq[num]++;
            highFreq = Math.max(highFreq, freq[num]);
            max = Math.max(max, num);
        } 
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<highFreq; i++){
            list.add(new ArrayList<>());
            for(int j=0; j<=max; j++){
                if(freq[j] > 0){
                    list.get(i).add(j);
                    freq[j]--;
                }
            }
        }
        return list;
    }
}