class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        LinkedHashSet<Integer> res=new  LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!res.contains(arr[i]))
            {
                res.add(arr[i]);
            }
        }
        return new ArrayList<>(res);
    }
}
