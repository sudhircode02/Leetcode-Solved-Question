class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public List<List<Integer>> findWinners(int[][] matches) {
        
        fillMap(matches);

        List<Integer> notLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int team = entry.getKey();
            int lossCount = entry.getValue();

            if(lossCount == 0) notLoss.add(team);
            else if(lossCount == 1) oneLoss.add(team);
        }
        Collections.sort(notLoss);
        Collections.sort(oneLoss);
        List<List<Integer>> list = new ArrayList<>();
        list.add(notLoss);
        list.add(oneLoss);
        return list;
    }

    private void fillMap(int[][] matches){
        for(int[] match : matches){
            int winner = match[0];
            int losser = match[1];
            if(!map.containsKey(winner)){
                map.put(winner, 0);
            }
            if(!map.containsKey(losser)){
                map.put(losser, 1);
            }
            else{
                map.put(losser, map.get(losser)+1);
            }
            
        }
    }


}