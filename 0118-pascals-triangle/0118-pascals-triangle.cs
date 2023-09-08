class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            List<Integer> temp = new ArrayList<>();
            pascal.add(temp);
            if(row == 1){
                pascal.get(0).add(1);
            }
            else if(row == 2){
                pascal.get(1).add(1);
                pascal.get(1).add(1);
            }
            else{
                pascal.get(row-1).add(1);
                for(int j=1; j<=row-2; j++){
                    int n = pascal.get(row-2).get(j-1) + pascal.get(row-2).get(j);
                    pascal.get(row-1).add(n);
                }
                pascal.get(row-1).add(1);
            }
        }
        return pascal;
    }
}