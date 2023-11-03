class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int i=0, j=1;
        while(i<target.length && j<=n){
            list.add("Push");
            if(j == target[i]) i++;       
            else list.add("Pop");
            j++;
        }
        return list;
    }
}