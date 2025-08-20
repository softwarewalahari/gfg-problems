// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n =arr.length;
        
        for(int i=0;i<k;i++)
        {
            int minindex = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[minindex])
                {
                    minindex=j;
                }
                
            }
            int temp=arr[minindex];
            arr[minindex] =arr[i];
            arr[i]=temp;
        }
        return arr[k-1];
        
    }
}
