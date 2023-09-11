class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int len = groupSizes.length;
        int count = 0;
        int n = 1;
        List<List<Integer>> list = new ArrayList<>();
        while(count < len){
            int i = 0;
            while (i < len) {
                List<Integer> temp = new ArrayList<>();
                for (int j=i; j<len; j++) {
                    if (groupSizes[j] == n) {
                        temp.add(j);
                        
                        if (temp.size() == n) {
                            list.add(temp);
                            i=j+1;
                            count += n;
                            break;
                        }
                    }
                    if(j==len-1) i=j+1;
                }
            }
            n++;
        }
        return list;
    }
}