class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int rev=0;
        int rem=0;
        int original=n;
        while(n>0)
        {
          rem=n%10;
          rev=(rev*10) +rem;
          n=n/10;
        }
        if(original == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}