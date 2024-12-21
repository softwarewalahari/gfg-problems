//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // Loop through the array and check if it's not sorted
        for (int i = 0; i < arr.length - 1; i++) { // Prevent accessing out-of-bound indices
            if (arr[i] > arr[i + 1]) { // Check if any element is greater than the next
                return false; // Return false immediately if order is violated
            }
        }
        return true; // If the loop completes, the array is sorted
    }
}


//{ Driver Code Starts.

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] numStrings = line.split(" ");
            int arr[] = new int[numStrings.length];
            for (int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(numStrings[i]);
            Solution ob = new Solution();
            boolean ans = ob.arraySortedOrNot(arr);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }
        scanner.close();
    }
}
// } Driver Code Ends