class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String str = "/";
        int len = path.length();
        for(int i=0; i<len; i++){
            String dir = "";
            while(i<len && path.charAt(i)=='/')
                i++;

            while(i<len && path.charAt(i)!='/'){
                dir += path.charAt(i);
                i++;
            }
            if(dir.equals("..")){
                if(!stack.empty()) stack.pop();
            }
            else if(dir.equals(".")) continue;
            else if (dir.length() != 0)
                stack.push(dir);
        }
        Stack<String> temp = new Stack<>();
        while(!stack.empty())
            temp.push(stack.pop());

        while(!temp.empty()){
            if(temp.size()!=1) str += (temp.pop()+"/");
            else str += temp.pop();
        }
        return str;
    }
}