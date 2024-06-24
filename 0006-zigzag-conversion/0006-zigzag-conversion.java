class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        List<List<Character>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++) list.add(new ArrayList<>());
        int c=0;
        boolean flag = true;
        for(char ch : s.toCharArray()){
            list.get(c).add(ch);
            if(c == numRows-1) flag = false;
            else if(c == 0) flag = true;
            if(flag) c++;
            else c--;
        }
        StringBuilder sb = new StringBuilder("");
        for(List<Character> row : list){
            for(char ch : row){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}