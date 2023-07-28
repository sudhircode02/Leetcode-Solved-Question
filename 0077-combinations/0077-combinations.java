class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[n];
        int j=0;
        for(int i=1; i<=n; i++){
            arr[j++] = i;
        }
        List<List<Integer>> ss = subset(arr);
        for(List<Integer> temp : ss){
            if(temp.size() == k){
                list.add(temp);
            }
        }
        return list;
    }
    
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}