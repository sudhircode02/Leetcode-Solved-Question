class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        subset(n, 1, k, new ArrayList<>(), list);
        return list;
    }
    
    public static void subset(int n, int start, int k, List<Integer> comb, List<List<Integer>> list){
        if(comb.size() == k){
            List<Integer> temp = new ArrayList<>(comb);
            list.add(temp);
            return;
        }
        for(int i=start; i<=n; i++){
            comb.add(i);
            subset(n, i+1, k, comb, list);
            comb.remove(comb.size()-1);
        }
    }

    
}