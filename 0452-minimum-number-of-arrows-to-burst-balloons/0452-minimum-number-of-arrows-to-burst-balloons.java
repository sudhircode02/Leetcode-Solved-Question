class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0],b[0]));
        int arrow = 0;
        int x=-1, y=-1;
        for(int[] point : points){
            int s=point[0], e=point[1];
            if((x==-1 && y==-1) || s>y){
                arrow++;
                x=s;
                y=e;
            }
            y = Math.min(e, y);
        }
        return arrow; 
    }
}