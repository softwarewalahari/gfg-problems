// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
 List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                List<Integer> subarray = new ArrayList<>();
                for(int k =i;k<=j;k++)
                {
                       subarray.add(arr[k]);
                }
                 result.add(subarray);
            }
        }
        return result;
    }
}