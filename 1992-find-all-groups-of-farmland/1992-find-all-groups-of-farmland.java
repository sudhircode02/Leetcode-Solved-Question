class Solution {
    int r2=0, c2=0;
    public int[][] findFarmland(int[][] land) {
        List<int[]> list = new ArrayList<>();
        for(int r1=0; r1<land.length; r1++){
            for(int c1=0; c1<land[0].length; c1++){
                if(land[r1][c1] == 1){
                    r2 = r1;
                    c2 = c1;
                    lastCorner(land, r1, c1);
                    list.add(new int[]{r1,c1,r2,c2});
                }
            }
        }
        return list.toArray(new int[0][0]);
    }

    private void lastCorner(int[][] land, int r, int c){
        if(r > r2) r2=r; 
        if(c > c2) c2=c;
        land[r][c] = 0;
        //down
        if(r<land.length-1 && land[r+1][c] == 1) lastCorner(land, r+1, c);
        //right
        if(c<land[0].length-1 && land[r][c+1] == 1) lastCorner(land, r, c+1);
    }
}