class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n= arr.length;
        int j=0 ; // position toplace next non zero
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
            int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
            j++;
            }
        }
    }
}