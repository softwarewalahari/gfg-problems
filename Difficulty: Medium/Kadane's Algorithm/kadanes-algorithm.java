//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
/*
class Solution {

    public int maxSubarraySum(int[] arr) {

        int current_sum=0;
      int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            current_sum+=arr[i];
            if(current_sum<0)
            {
                current_sum=0;
            }
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
}
*/
class Solution {

    public int maxSubarraySum(int[] arr) {

        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            // Instead of resetting current_sum, we just compare it with max_sum.
            max_sum = Math.max(current_sum, max_sum);
            if (current_sum < 0) {
                current_sum = 0; // Only reset current_sum if it's negative (for the next subarray).
            }
        }
        
        return max_sum;
    }
}
