class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int cursum=arr[0];
         int maxsum = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            cursum=Math.max(arr[i],cursum+arr[i]);
            maxsum= Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}
