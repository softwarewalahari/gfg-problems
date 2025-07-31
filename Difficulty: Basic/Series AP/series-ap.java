
class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
        int nthterm=a1;
        int d=a2-a1;
        for(int i=2;i<=n;i++)
        {
            nthterm=nthterm + d;
        }
        return nthterm;
    }
}
