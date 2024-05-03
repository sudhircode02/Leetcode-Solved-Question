class Solution {
    public int compareVersion(String version1, String version2) {
        List<Integer> v1 = split(version1);
        List<Integer> v2 = split(version2);
        int p1=0, p2=0;
        while(p1<v1.size() && p2<v2.size()){
            if(v1.get(p1) < v2.get(p2)){
                return -1;
            }
            else if(v1.get(p1) > v2.get(p2)) return 1;
            p1++; p2++;
        }
        while(p1<v1.size()){
            if(v1.get(p1++)> 0) return 1;
        }
        while(p2<v2.size()){
            if(v2.get(p2++) > 0) return -1;
        }
        return 0;
    }

    private List<Integer> split(String s){
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '.'){
                list.add(Integer.valueOf(sb.toString()));
                sb = new StringBuilder("");
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        list.add(Integer.valueOf(sb.toString()));
        return list;
    }
}