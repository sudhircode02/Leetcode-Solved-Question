class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> bits(n+1, 0);
        for(int i=0; i<=n; i++){
            bits[i] = countSetBit(i);
        }
        return bits;
    }
    int countSetBit(int n){
        int count = 0;
        while(n > 0){
            if((n&1) == 1) count++;
            n >>= 1;
        }
        return count;
    }
};