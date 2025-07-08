// User function Template for Java
class Solution 
{
    public static void fizzBuzz(int number)
    {
        if((number % 3 == 0) && (number % 5 == 0))
        { 
               String FB = "FizzBuzz";
                System.out.println(FB);
              
        }
       else if (number % 3 == 0)
       {
           String F ="Fizz";
           System.out.println(F);
         

           
       }
       else if(number % 5 == 0)
       {
           
            String B="Buzz";
            System.out.println(B);
            
       }
       else
        {
            System.out.println(number);
        }
        
     }
    public static void main (String[] args)
    {
       
        fizzBuzz(6);
    }
}