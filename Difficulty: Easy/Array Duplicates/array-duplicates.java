//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().findDuplicates(arr);
            Collections.sort(result);
            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public List<Integer> findDuplicates(int[] arr) {
   /* List<Integer> duplicates = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
         for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != arr[i])) {
                duplicates.add(arr[i]); // Add duplicate only once
            }
        }

        return duplicates;
      
}
}
*/
 


// List<Integer> result = solution.findDuplicates(arr);

   //     System.out.println(result); 
  /* HashMap<Integer,Integer> H =new HashMap<>();
    List<Integer> duplicates = new ArrayList<>();
   for(int i=0;i<arr.length;i++)
   {
       H.put(arr[i],H.getOrDefault(arr[i],0) + 1);
   }
   
   for (int key : H.keySet()) {
            if (H.get(key) > 1) {
                duplicates.add(key);
            }
        }

        return duplicates;
        }
        }
        */
        
         HashSet<Integer> h = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        // Iterate through the array
        for (int num : arr) {
            // If the number is already in the 'seen' set, it's a duplicate
            if (h.contains(num)) {
                duplicates.add(num);
            } else {
                h.add(num); // Otherwise, add it to the set
            }
        }

        return duplicates;
    }
}
