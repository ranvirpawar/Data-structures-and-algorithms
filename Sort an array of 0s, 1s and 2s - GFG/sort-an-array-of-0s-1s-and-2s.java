//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int nums[], int n)
    {
        // code here 
        int i = 0;
        int nextZero = 0;
        int nextTwo = n-1;
        while( i <= nextTwo){
            if (nums[i] == 0){
                int temp = nums[nextZero];
                nums[nextZero] = nums[i];
                nums[i]= temp;
                i++;
                nextZero++;
            } else if ( nums[i] == 2){
                int temp = nums[nextTwo];
                nums[nextTwo] = nums[i];
                nums[i] = temp;
               // i++;
                nextTwo--;
            }else{
                i++;
            }
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends