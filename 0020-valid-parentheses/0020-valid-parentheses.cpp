class Solution {
public:
    bool isValid(string s) {
        char stack[s.length()];
        int index = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s[i];
            if(ch=='{' || ch=='[' || ch=='('){
                index++;
                stack[index] = ch;
            }
            else{
                if(index < 0) return false;
                else if(stack[index]=='{' && ch=='}') index--;
                else if(stack[index]=='(' && ch==')') index--;
                else if(stack[index]=='[' && ch==']') index--;
                else return false;
            }
        }
        return (index == -1)? true : false;
    }
};