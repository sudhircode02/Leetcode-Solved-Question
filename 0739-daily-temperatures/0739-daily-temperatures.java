class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack =new Stack<>();
        int[] res =new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()) res[i] = 0;
            else 
                res[i] = stack.peek()-i;
            stack.push(i);
        }
        return res;
    }
}