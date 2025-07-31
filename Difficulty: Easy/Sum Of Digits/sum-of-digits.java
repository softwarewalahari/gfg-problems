class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum=0;
        while(n>0)
        {
        int n1=n % 10;
        sum=sum+n1;
         n=n/10;
    }
    return sum;
    }
}
