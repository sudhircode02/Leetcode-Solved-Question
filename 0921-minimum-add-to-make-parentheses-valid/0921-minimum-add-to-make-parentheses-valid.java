class Solution {
    public int minAddToMakeValid(String s) {
        if(s.isEmpty()) return 0;
        int len = s.length();
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(ch=='(') stack.push(ch);
            else{
                if(stack.isEmpty()) count++;
                else stack.pop();                
            }
        }
        return count+stack.size();
    }
}