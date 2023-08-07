class Solution {
    public String countAndSay(int n) {
     if(n==1) return "1";
        List<Integer> list = new ArrayList<>();
        list.add(1);
        return helper(1 , n, list);
    }

    private static String helper(int i, int n, List<Integer> list) {
        if(i==n){
            StringBuilder sb = new StringBuilder();
            for(int num : list){
                sb.append(num);
            }
            return sb.toString();
        }
        List<Integer> temp = toWord(list);
        return helper(i+1, n, temp);
    }

    public static List<Integer> toWord(List<Integer> list){
        List<Integer> temp = new ArrayList<>();
        int count = 1;
        int len = list.size();
        for(int i=0; i<len-1; i++){
            if(list.get(i) == list.get(i+1)){
                count++;
            }
            else{
                temp.add(count);
                temp.add(list.get(i));
                count = 1;
            }
        }
        temp.add(count);
        temp.add(list.get(len-1));

        return temp;
    }
}