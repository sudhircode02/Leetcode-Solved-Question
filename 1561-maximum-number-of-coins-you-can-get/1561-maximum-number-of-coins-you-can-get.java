class Solution {
    public int maxCoins(int[] piles) {
        int totalCoins = 0, chance = 0, totalChance = piles.length/3;
        Arrays.sort(piles);
        for(int i=piles.length-2; chance<totalChance; i-=2, chance++)
            totalCoins += piles[i];
        return totalCoins;
    }
}