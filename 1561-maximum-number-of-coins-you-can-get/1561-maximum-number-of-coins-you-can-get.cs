public class Solution {
    public int MaxCoins(int[] piles) {
        int coins=0, chance=0, totalChance=piles.Length/3;
        Array.Sort(piles);
        for(int i=piles.Length-2; chance<totalChance; i-=2, chance++) coins += piles[i];
        return coins;
    }
}