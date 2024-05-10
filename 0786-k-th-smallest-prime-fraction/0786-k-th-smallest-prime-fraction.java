class Fraction implements Comparable<Fraction> {
    int numerator;
    int denominator;

    public Fraction(int num, int den)
    {
        numerator = num;
        denominator = den;
    }
    public int compareTo(Fraction other)
    {
        double num1 = (double)numerator / denominator;
        double num2 = (double)other.numerator / other.denominator;
        return (int)Math.signum(num1 - num2);
    }
}

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        ArrayList<Fraction> fractions = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                fractions.add(new Fraction(arr[i], arr[j]));
        
        Collections.sort(fractions);
        return new int[] {fractions.get(k - 1).numerator, fractions.get(k - 1).denominator};

    }
}