public class Solution {
    public int CountHomogenous(string s) {
        long count = 0;
        int i=0;
        while(i<s.Length){
            char ch = s[i];
            int j=i+1;
            while(j<s.Length && s[j]==ch){
                j++;
            }
            long n = j-i;
            count += (n*(n+1))/2;
            i=j;
        }
        count %= 1000000007;
        return (int)count;
    }
}