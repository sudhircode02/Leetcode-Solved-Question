class Solution {
public:
    string multiply(string num1, string num2) {
        if(num1 == "0" || num2 == "0") return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        std::vector<int> prod(len1+len2);
        for(int i=len1-1; i>=0; i--){
            int n1 = num1[i]-'0';
            for(int j=len2-1; j>=0; j--){
                int n2 = num2[j]-'0';
                int mul = n1*n2;
                
                prod[i+j+1] += mul;
                prod[i+j] += prod[i+j+1]/10;
                prod[i+j+1] %= 10;
            }
        }
        std::string sb = "";
        int i=0;
        while(i<len1+len2 && prod[i] == 0){
            i++;
        }
        while(i < len1+len2){
            sb += std::to_string(prod[i]);
            i++;
        }
        return sb;
    }
};