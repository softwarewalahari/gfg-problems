
class Solution {
    public String average(int arr[]) {
        // code here
        double total = 0;
        for(int i=0;i<arr.length;i++)
        {
            total += arr[i]; 
        }
        double average= total/arr.length;
         return String.format("%.2f", average);
    }
}