class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
        permutaion(nums, new ArrayList<>(), list, 0);
        return list;
    }

    public static void permutaion(int[] nums, List<Integer> temp, List<List<Integer>> list, int i){
        if(i==nums.length){
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