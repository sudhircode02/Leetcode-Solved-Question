class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int[] prod = new int[len1+len2];
        for(int i=len1-1; i>=0; i--){
            int n1 = num1.charAt(i)-'0';
            for(int j=len2-1; j>=0; j--){
                int n2 = num2.charAt(j)-'0';
                int mul = n1*n2;
                
                prod[i+j+1] += mul;
                prod[i+j] += prod[i+j+1]/10;
                prod[i+j+1] %= 10;
            }
        }
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while(i<prod.length && prod[i] == 0){
            i++;
        }
        while(i < prod.length){
            sb.append(prod[i]);
            i++;
        }
        return sb.toString();
    }
}