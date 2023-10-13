class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int n : asteroids){
            if(n > 0){
                stack.push(n);
            }
            else{
                n *= -1;
                boolean isEqual = false;
                while(!stack.isEmpty() && stack.peek() <= n){
                    int popped = stack.pop();
                    if(n == popped){
                        isEqual = true;
                        break;
                    } 
                }
                if(stack.isEmpty() && !isEqual){
                    list.add(n*-1);
                }
            }
        }
        int[] ans = new int[list.size() + stack.size()];
        int i = ans.length-1;
        while(!stack.isEmpty()){
            ans[i--] = stack.pop();
        }
        i=0;
        for(int n : list){
            ans[i++] = n;
        }
        return ans;
    }
}