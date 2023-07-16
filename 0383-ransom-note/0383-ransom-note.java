class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1 = ransomNote.length();
        int len2 = magazine.length();
        if(len1 > len2){
            return false;
        } 
        char[] arr1 = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();
        for(int i=0; i<len1; i++){
            boolean isFound = false;
            for(int j=0; j<len2; j++){
                if(arr2[j] == '#'){
                    continue;
                }
                if(arr1[i] == arr2[j]){
                    arr2[j] = '#';
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                return false;
            }
        }
        return true;
    }
}