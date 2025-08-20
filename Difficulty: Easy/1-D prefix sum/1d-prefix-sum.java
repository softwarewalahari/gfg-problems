class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int sum=0;
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            res.add(sum);
            
        }
        return res;
        
    }
}