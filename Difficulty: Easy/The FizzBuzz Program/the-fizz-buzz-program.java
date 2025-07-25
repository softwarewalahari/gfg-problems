import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String result;
        int a =sc.nextInt();
        if(a % 3 == 0 && a%5 == 0)
        {
            result="FizzBuzz";
        }
        else if( a % 5 == 0)
        {
            result= "Buzz";
        }
        else if(a% 3 == 0)
        {
            result="Fizz";
        }
        else
        {
            result= a +"";
        }
        System.out.println(result);
    }
}