class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceScore = 0, bobScore = 0;
        for(int i=1; i<colors.length()-1; i++){
            
            char ch1 = colors.charAt(i-1);
            char ch2 = colors.charAt(i);
            char ch3 = colors.charAt(i+1);

            if(ch1=='A' && ch2=='A' && ch3=='A') 
                aliceScore++;
            else if(ch1=='B' && ch2=='B' && ch3=='B') 
                bobScore++;
        }
        return aliceScore > bobScore;
    }
}