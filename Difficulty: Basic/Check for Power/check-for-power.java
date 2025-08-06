// User function Template for Java
class Solution {
    public boolean isPowerOfAnother(int X, int Y) 
    {
        if(X == 1) 
        {
            return false;
        }
        int pow=1;
        while(pow<Y)
        {
            pow =pow*X;
        }
        if (pow == Y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
