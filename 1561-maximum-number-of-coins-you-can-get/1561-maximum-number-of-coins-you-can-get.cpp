class Solution {
public:
    int maxCoins(vector<int>& piles) {
        int totalCoins = 0, chance = 0, totalChance = piles.size()/3;
        sort(piles.begin(), piles.end());
        for(int i=piles.size()-2; chance<totalChance; i-=2, chance++)
            totalCoins += piles[i];
        return totalCoins;
    }
};