class Solution {
    fun integerBreak(n: Int): Int {
        if(n==2) return 1;
        var maxProd:Int = 0;
        for(i in 2 .. n-1){
            var prod:Int = 1;
            var num = n;
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
}