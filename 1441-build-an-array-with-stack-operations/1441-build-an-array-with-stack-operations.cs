public class Solution {
    public IList<string> BuildArray(int[] target, int n) {
        List<string> list = new List<string>();
        int i=0, j=1;
        while(i<target.Length && j<=n){
            list.Add("Push");
            if(j == target[i]) i++;       
            else list.Add("Pop");
            j++;
        }
        return list;
    }
}