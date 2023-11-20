class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int time = 0;
        int p=0, m=0, g=0;
        for(int i=0; i<garbage.length; i++){
            time += garbage[i].length();
            boolean[] arr = isContain(garbage[i]);
            if(arr[0]) g=i;
            if(arr[1]) m=i;
            if(arr[2]) p=i;
        }
        while(p>0 && m>0 && g>0){
            time += travel[--p] + travel[--m] + travel[--g]; 
        }
        while(p>0) time += travel[--p];
        while(m>0) time += travel[--m];
        while(g>0) time += travel[--g];
        return time;
    }
    public boolean[] isContain(String s){
        boolean[] arr = new boolean[3];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'G') arr[0] = true;
            else if(s.charAt(i) == 'M') arr[1] = true;
            else arr[2] = true;
        }
        return arr;
    }
}