class Solution {
    public int numberOfBeams(String[] bank) {
        int laserCount = 0;
        int upperDevice = 0;
        int lowerDevice = 0;
        for(String row : bank){
            for(char ch : row.toCharArray()){
                lowerDevice += ch-'0';
            }
            if(lowerDevice != 0){
                laserCount += upperDevice * lowerDevice;
                upperDevice = lowerDevice;
                lowerDevice = 0;
            }
        }
        return laserCount;
    }
}