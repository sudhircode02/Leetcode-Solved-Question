class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> temp = new ArrayList<>();
        int count = 0;
        for(int i=0; i<nums.size(); i++){
            int len = nums.get(i).size();                        
            while((len+i)-temp.size() > 0){
                temp.add(new ArrayList<>());
            }
            int index = i;
            for(int j=0; j<len; j++){
                temp.get(index++).add(nums.get(i).get(j));
                
            }
            count += len;
        }
        int index = 0;
        int[] res = new int[count];
        for(List<Integer> row : temp){
            for(int i=row.size()-1; i>=0; i--){
                res[index++] = row.get(i);
            }
        }
        return res;
    }
}
