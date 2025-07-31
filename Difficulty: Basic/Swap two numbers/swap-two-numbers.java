class Solution
{
    static List<Integer> get(int a, int b) 
    {
        // code here
        int temp=a;
        a=b;
        b=temp;
       List<Integer> swap=new ArrayList<>();
       swap.add(a);
       swap.add(b);
       return swap;
       
    }
}