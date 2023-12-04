class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        for(int i=0; i<=num.length()-3; i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                max = Math.max(max, num.charAt(i)-'0');
            }
        }
        if(max == -1) return "";
        if(max == 0)return "000";
        return Integer.toString((max*100)+(max*10)+max);
    }
}