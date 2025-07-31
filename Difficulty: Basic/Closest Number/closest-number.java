class Solution {
    static int closestNumber(int n, int m) {
        int rem = n % m;

        // If already divisible
        if (rem == 0)
            return n;

        // Option 1: Floor value
        int lower = n - rem;

        // Option 2: Ceil value
        int higher = (n * m > 0) ? (n + (m - rem)) : (n - (m + rem));

        // Compare distances
        if (Math.abs(n - lower) < Math.abs(n - higher))
            return lower;
        else if (Math.abs(n - lower) > Math.abs(n - higher))
            return higher;
        else
            return (Math.abs(lower) > Math.abs(higher)) ? lower : higher;
    }
}
