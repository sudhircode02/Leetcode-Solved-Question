class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> path : paths){
            String start = path.get(0);
            String dest = path.get(1);
            map.put(start, dest);
        }
        String dest = paths.get(0).get(0);
        while(map.containsKey(dest)){
            dest = map.get(dest);
        }

        return dest;
    }
}