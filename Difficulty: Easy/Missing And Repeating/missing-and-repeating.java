//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java




class Solution {
    // Function to find two elements in array: one repeated and one missing.
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        int n = arr.length;
        int repeat = -1, missing = -1;

        // Step 1: Traverse the array and mark visited elements by making them negative
        for (int i = 0; i < n; i++) {
            int absVal = Math.abs(arr[i]);
            
            // If the element at index absVal-1 is already negative, it is the repeated element
            if (arr[absVal - 1] < 0) {
                repeat = absVal;
            } else {
                // Mark the element at the index corresponding to absVal as negative
                arr[absVal - 1] = -arr[absVal - 1];
            }
        }

        // Step 2: Find the missing element by checking which index has a positive value
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        // Step 3: Add the result to the list
        result.add(repeat);
        result.add(missing);

        return result;
    }
}
