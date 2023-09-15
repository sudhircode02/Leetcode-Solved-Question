class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        int len = stones.size()-1;
        while(len >= 1){
            sort(stones.begin(), stones.end());
            int last = stones[len];
            int secLast = stones[len-1];
            int diff = abs(last-secLast);
            if(diff == 0) len -= 2;
            else{
                len--;
                stones[len] = diff;
            }
        }
        if(len<0) return 0;
        return stones[0];
    }
};