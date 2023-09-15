class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length-1;
        while(len >= 1){
            Arrays.sort(stones);
            int last = stones[len];
            int secLast = stones[len-1];
            int diff = Math.abs(last-secLast);
            if(diff == 0) len -= 2;
            else{
                len--;
                stones[len] = diff;
            }
        }
        if(len<0) return 0;
        return stones[0];
    }
}