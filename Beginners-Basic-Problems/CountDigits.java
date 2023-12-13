import java.io.*;
import java.util.*;

public class CountDigits {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
    
}
class Solution{
        public  int evenlyDivides(int N){
            // code here
            int count = 0,temp = N,i=0;
            while(temp!=0){
                i = temp%10;
                if(i!=0) if(N%i==0) count++;
                temp/=10;
            }
            return count;
        }
}        
