// User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
        if(n<m)
        {
            return "lesser";
        }
        else if(n>m)
        {
            return "greater";
        }
        else
        {
            return "equal";
        }
       
    }
    public static void main(String[] args) {
        System.out.println(compareNM(5, 8)); 
    }
}