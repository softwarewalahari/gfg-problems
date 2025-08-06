// User function Template for Java
class Solution {
    public boolean checkValidity(int a, int b, int c)
    {
       
        return  (a+b > c) && (b+c > a) && (a+c > b);
    }
}