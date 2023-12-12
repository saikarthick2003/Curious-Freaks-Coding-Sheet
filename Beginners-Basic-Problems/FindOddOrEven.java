//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class FindOddOrEven
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.oddEven(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String oddEven(int N){
        // code here
        if(N%2 == 0) return "even";
        else return "odd";
    }
}
