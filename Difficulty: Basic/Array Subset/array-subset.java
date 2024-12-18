//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] a = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                a[i] = Integer.parseInt(numsStr[i]);
            }
            line = read.readLine().trim();
            numsStr = line.split(" ");
            int[] b = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                b[i] = Integer.parseInt(numsStr[i]);
            }
            Solution ob = new Solution();
            if (ob.isSubset(a, b))
                System.out.println("Yes");
            else
                System.out.println("No");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends







class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> H = new HashMap<>();
        for (int num : a) {
            H.put(num, H.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (H.containsKey(num) && H.get(num) > 0) {
                H.put(num, H.get(num) - 1);
            } else {
                return false; // Return false if any element of b is not in a
            }
        }

        return true; // Return true if all elements of b are found in a
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 3};
        
        if (solution.isSubset(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
