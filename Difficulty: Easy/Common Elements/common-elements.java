// User function Template for Java

class Solution {
    
    public static ArrayList<Integer> commonElements(int a[], int b[])
    {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
         ArrayList<Integer> result = new ArrayList<>();
        int i=0, j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i] == b[j])
            {
                result.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]< b[j])
            {
                i++;
            }
            else
            { 
                j++;
            }
        }
         return result;
    }
    public static void main (String[] args)
    {
         
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 3, 5};

        ArrayList<Integer> common = commonElements(a, b);
        System.out.println("Common elements: " + common);
       

    }
}     