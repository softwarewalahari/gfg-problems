class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<n;i++)
       {
           res.put(arr[i],res.getOrDefault(arr[i],0) +1);
           if(res.get(arr[i]) > n / 2)
           {
               return arr[i];
               
           }
       }
       return -1;
        //    int count = 0;
         //   for(int j=0;j<n;j++)
           // {
             //   if(arr[i] == arr[j])
               // {
                 //   count++;
                //}
        //    }
          //  if(count > (n/2))
            //{
              //  return arr[i];
            //}
    //    }
      //  return -1;
      
    }
    
}