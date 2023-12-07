public class Solution {
    public string LargestOddNumber(string num) {
        for(int i=num.Length-1; i>=0; i--){
            char ch = num[i];
            if(ch=='1' || ch=='3' || ch=='5' || ch=='7' || ch=='9')
                return num.Substring(0, i+1);
        }
        return "";
    }
}