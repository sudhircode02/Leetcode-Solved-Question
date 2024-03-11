class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder("");
        int[] sfreq = new int[26];
        for(char ch : s.toCharArray()) sfreq[ch-'a']++;
        for(char ch : order.toCharArray()){
            while(sfreq[ch-'a'] > 0) {
                sb.append(ch);
                sfreq[ch-'a']--;
            }
        }
        for(int i=0; i<26; i++){
            while(sfreq[i] > 0) {
                sb.append((char)(i+'a'));
                sfreq[i]--;
            }
            
        } 
        return sb.toString();
    }
}