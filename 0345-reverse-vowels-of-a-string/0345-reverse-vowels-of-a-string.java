class Solution {
    public String reverseVowels(String s) {
        char[] temp = s.toCharArray();
        int i = 0;
        int j = temp.length-1;
        boolean iCheck = false;
        boolean jCheck = false;
        while(i<j){
            if(temp[i]=='a' || temp[i]=='e' || temp[i]=='i' || temp[i]=='o' || temp[i]=='u'){
                iCheck = true;
            }
            else if(temp[i]=='A' || temp[i]=='E' || temp[i]=='I' || temp[i]=='O' || temp[i]=='U'){
                iCheck = true;
            }
            else{
                i++;
            }

            if(temp[j]=='a' || temp[j]=='e' || temp[j]=='i' || temp[j]=='o' || temp[j]=='u'){
                jCheck = true;
            }
            else if(temp[j]=='A' || temp[j]=='E' || temp[j]=='I' || temp[j]=='O' || temp[j]=='U'){
                jCheck = true;
            }
            else{
                j--;
            }
            if(iCheck && jCheck){
                char tem = temp[i];
                temp[i] = temp[j];
                temp[j] = tem;
                i++;
                j--;
                iCheck = false;
                jCheck = false;
            }
        }
        
        return new String(temp);
    }
}