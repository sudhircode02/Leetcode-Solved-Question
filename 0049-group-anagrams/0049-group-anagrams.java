class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if(strs.length == 0){
            return ans;
        }
        boolean[] check = new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            if(check[i]) continue;
            List<String> temp = new ArrayList<>();
            String str1 = strs[i];
            temp.add(str1);

            for(int j=i+1; j<strs.length; j++){
                if(check[j]) continue;
                String str2 = strs[j];
                if(isAnagram(str1,str2)){
                    temp.add(str2);
                    check[j] = true;
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    public boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        for(int i=0; i<chArr1.length; i++){
            if(chArr1[i] != chArr2[i]){
                return false;
            }
        }
        return true;
    }
}