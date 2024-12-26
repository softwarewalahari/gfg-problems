//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends




class Solution {
    static ArrayList<Integer> getSum(int N) {
        ArrayList<Integer> h = new ArrayList<>();
        int Sum = 0; 
        int Sum1 = 0;  

        // Loop through the first N natural numbers
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                Sum += i; 
            } else {
                Sum1 += i; 
            }
        }

        
        h.add(Sum);
        h.add(Sum1);

        return h;
    }


}
