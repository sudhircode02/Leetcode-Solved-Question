class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        int len = s.length();
        for(int i=1; i<=len/2; i++){
            std::string ss1 = s.substr(0, i);
            int j=i;
            bool isEqual = true;
            while(j < len){
                int n = j + ss1.length();
                if(n > len){
                    isEqual = false;
                    break;
                }
                std::string ss2 = s.substr(j,n-j);
                if(ss1 != ss2){
                    isEqual = false;
                    break;
                }
                j = n;
            }   
            if(isEqual) return true;
        }
    return false;
    }
};