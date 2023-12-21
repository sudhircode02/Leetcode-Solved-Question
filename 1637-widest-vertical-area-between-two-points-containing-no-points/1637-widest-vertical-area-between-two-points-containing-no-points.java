class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        Arrays.sort(points, Comparator.comparingDouble(o -> o[0]));
        int res = -1;
        for(int i=1; i<n; i++){
            int diff = points[i][0] - points[i-1][0];
            res = Math.max(res, diff);
        }
        return res;
    }
}