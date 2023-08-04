class Solution {
    public double myPow(double x, int n) {
       if (n == 0) 
            return 1.0;

        double halfPow = myPow(x, n/2);
        double halfPowSqr = halfPow * halfPow;
        if (n % 2 == 1) 
            return x * halfPowSqr;

        if (n % 2 == 0) 
            return halfPowSqr;

        return 1 / myPow(x, -n);
    }
}