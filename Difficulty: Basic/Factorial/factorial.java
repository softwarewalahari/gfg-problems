class Solution {
    // Function to calculate factorial of a number.
    int fact=1;
    int factorial(int n) {
        if((n == 0)  || (n==1)) return 1;
        fact=n * factorial(n-1);
        return fact;
        
        
        
    }
}
