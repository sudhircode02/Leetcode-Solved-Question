class Solution {
    public boolean isValid(String s) {
        /*
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                else if(stack.peek()=='{' && ch=='}') stack.pop();
                else if(stack.peek()=='[' && ch==']') stack.pop();
                else if(stack.peek()=='(' && ch==')') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
        */
        char[] stack =new char[s.length()];
        int index = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
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
}