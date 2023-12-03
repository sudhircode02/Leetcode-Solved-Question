class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int dis = 0;
        int sX = points[0][0];
        int sY = points[0][1];
        for (int i = 1; i<points.length; i++) {
            int eX = points[i][0];
            int eY = points[i][1];
            dis += Math.max(Math.abs(eX - sX), Math.abs(eY - sY));
            sX = eX; sY = eY;
        }
        
        return dis;
    }
}