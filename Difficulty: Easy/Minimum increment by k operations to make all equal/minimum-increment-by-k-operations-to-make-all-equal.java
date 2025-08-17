class Solution {

    static int minOps(int arr[], int k) {
        
        int max=Integer.MIN_VALUE;
        for(int i= 0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        int res =0;
        for(int i=0;i<arr.length;i++)
        {
            if((max-arr[i]) % k  != 0)
            {
                return -1;
            }
            else
            {
                res =res + (max-arr[i]) / k;
            }
        }
        return res;
    }
}
    