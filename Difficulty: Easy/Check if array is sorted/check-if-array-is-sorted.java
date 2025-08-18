class Solution
{
    public boolean isSorted(int[] arr) 
    {
        
      boolean sorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
              if(arr[i] > arr[i+1])
               {
                  sorted=false;
                  break;
           
               }
        }
           return sorted;
        
    }
}