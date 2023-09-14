class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> temp = new ArrayList<>();
            if(i==0) temp.add(1);
            else if(i==1){
                temp.add(1);
                temp.add(1);
            }
            else{
                temp.add(1);
                for(int j=1; j<i; j++){
                    int n1 = list.get(i-1).get(j-1);
                    int n2 = list.get(i-1).get(j);
                    temp.add(n1+n2);
                }
                temp.add(1);
            }
            list.add(temp);
        }
        return list.get(rowIndex);
    }
}