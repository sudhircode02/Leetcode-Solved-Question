class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permut = new ArrayList<>();
        permutaion(nums, new ArrayList<>(), permut, 0);
        return permut;
    }

    
    private static boolean isEqual(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if(!Objects.equals(list1.get(i), list2.get(i))) return false;
        }
        return true;
    }

    public static void permutaion(int[] nums, List<Integer> temp, List<List<Integer>> list, int i){
        if(i==nums.length){
            for(List<Integer> per : list){
                if(isEqual(per,temp)){
                    return;
                }
            }
            list.add(temp);
            return;
        }
        for(int j=0; j<temp.size()+1; j++){
            List<Integer> tem = new ArrayList<>();
            for(int k=0; k<j; k++){
                tem.add(temp.get(k));
            }
            tem.add(nums[i]);
            for(int k=j; k<temp.size(); k++){
                tem.add(temp.get(k));
            }
            permutaion(nums, tem, list, i+1);
        }
    }
}