class Solution {
    public int compress(char[] chars) {
        /*
        int i=0, j=0, count = 0, n = chars.length;
        int k=0;
        while(j<n){
            if(chars[i] != chars[j]){
                chars[k] = chars[i];
                int c = j-i;
                int d = (int)Math.log10(c)+1;
                if(c == 1){
                    count += d;
                    k++;
                } 
                else{
                    int l = k+d;
                    count += d+1;
                    while(c>0){
                        chars[l--] = (char)(c%10+'0');
                        c /= 10;
                    }
                    k += d+1;
                } 
                i = j;
            }
            j++;
        }
        if(i < j){    
            chars[k] = chars[i];
            int c = j-i;
            int d = (int)Math.log10(c)+1;
            if(c == 1){
                count += d;
            } 
            else{
                int l = k+d;
                count += d+1;
                while(c>0){
                    chars[l--] = (char)(c%10+'0');
                    c /= 10;
                }
            }
        }
        return count;
       
*/

        int r=0, w=0;
        while(r < chars.length){
            char ch = chars[r];
            int count = 0;
            while(r<chars.length && chars[r] == ch){
                r++;
                count++;
            } 
            chars[w++] = ch;
            if(count > 1){
                for(char d : Integer.toString(count).toCharArray()){
                    chars[w++] = d;
                }
            }
        }
        return w;
 
    }
}