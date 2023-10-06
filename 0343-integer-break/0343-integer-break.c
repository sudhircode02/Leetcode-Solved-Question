int integerBreak(int n){
        if(n==2) return 1;
        int maxProd = 0;
        for(int i=n-1; i>1; i--){
            int prod = 1;
            int num = n;
            while(num >= i){
                prod *= i;
                num -= i;
                if(prod*num > maxProd){
                    maxProd = prod*num;
                }
            }
        }
        return maxProd;
}