class Solution {
    public int minSteps(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for(char ch : s.toCharArray()) sFreq[ch-'a']++;
        for(char ch : t.toCharArray()) tFreq[ch-'a']++;

        int step = 0;
        for(int i=0; i<26; i++){
            step += Math.abs(tFreq[i] - sFreq[i]);
        }
        return step/2;
    }
}