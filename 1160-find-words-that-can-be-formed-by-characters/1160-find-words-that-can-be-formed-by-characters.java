class Solution {
    int[] map =new int[26];
    public int countCharacters(String[] words, String chars) {
        for(char ch : chars.toCharArray()){
            map[ch-'a']++;
        }
        int count = 0;
        for(String s : words){
            if(helper(s)) count += s.length();
        }
        return count;
    }

    private boolean helper(String s){
        int[] freq = new int[26]; 
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a'] > map[ch-'a']) return false;
        }
        
        return true;
    }
}