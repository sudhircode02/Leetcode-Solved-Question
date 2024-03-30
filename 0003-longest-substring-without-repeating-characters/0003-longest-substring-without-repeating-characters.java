class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int s=0, e=0, len=0;
        while(e < str.length()){
            char ch = str.charAt(e);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
                while(map.get(ch) > 1){
                    char c = str.charAt(s);
                    map.put(c, map.get(c)-1);
                    s++;
                }
            }
            else map.put(ch, 1);
            len = Math.max(len, (e-s)+1);
            e++;
        }
        return len;
    }
    
}