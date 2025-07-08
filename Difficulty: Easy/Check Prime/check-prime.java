class Solution {
    public static boolean prime(int n) {
       
       if (n<=1)
       {
           return false;
       }
       
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if ( n % i == 0)
            {
                count++;
            }
        }
        return count == 2;
      }
}