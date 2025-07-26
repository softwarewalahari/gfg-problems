// User function Template for Java
class Solution {
    public static void difference(int n1, int n2) {

        // Write your code here
        for(int i=1;i<=10;i++)
        {
        int mul1= n1 * i;
        int mul2=n2 * i;
        System.out.print((mul1 - mul2) + " ");
        }
    }
}