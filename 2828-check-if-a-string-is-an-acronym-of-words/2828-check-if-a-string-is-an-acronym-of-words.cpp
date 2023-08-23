class Solution {
public:
    bool isAcronym(vector<string>& words, string s) {
        string sb = "";
        for(int i=0; i<words.size(); i++){
            sb += words[i].at(0);    
        }
        return s == sb;
    }
};