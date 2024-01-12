class Solution {
    public boolean halvesAreAlike(String s) {
        return vowelCount(s.substring(0,s.length()/2)) == vowelCount(s.substring(s.length()/2)); 
    }
    
    private int vowelCount(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
                count++;
        }
        return count;
    }
}