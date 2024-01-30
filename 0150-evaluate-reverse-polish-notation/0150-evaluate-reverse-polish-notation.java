class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.length() == 1 && s.charAt(0) < 48){
                int n1 = stack.pop();
                int n2 = stack.pop();
                if (s.equals("+")) stack.push(n2+n1);
                else if (s.equals("-")) stack.push(n2-n1);
                else if (s.equals("*")) stack.push(n2*n1);
                else stack.push(n2/n1);
            }
            else stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}