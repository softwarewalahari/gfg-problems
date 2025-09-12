// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
          int digits=String.valueOf(n).length();
          int sum=0;
          while(temp>0)
          {
            int digit=temp%10;
          sum= sum+(int)Math.pow(digit,digits);
          temp = temp/10;
           
          }
          if(sum == n)
          {
            return true;
          }
          else
          {
            return false;
          }
    }
}