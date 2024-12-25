//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        int count;
      
        for( int i=0;i<arr.length;i++)
        {
            count=1;
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i] == arr[j])
            {
                count++;
            }
        }
        if(count > arr.length/2 )
        {
            return arr[i];
        }
        }
    
    return -1;
    }
}