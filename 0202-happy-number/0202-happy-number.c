bool isHappy(int n){
 if(n == 1) return true;
        
        int slow = n;
        int fast = n;
        while(true){
            slow = sqrSum(slow);
            if(slow == 1) return true;
            fast = sqrSum(sqrSum(fast));
            if(fast == 1) return true;
            if(slow == fast) return false;
        }
        
    }

   int sqrSum(int n){
        int sum = 0;
        while(n > 0){
            int ld = n%10;
            sum += ld*ld;
            n /= 10;
        }
        return sum;
    }