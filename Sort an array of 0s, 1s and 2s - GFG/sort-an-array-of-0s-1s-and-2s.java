//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int i=0;
        int nextZero =0;
        int nextTwo =n-1;
        
        while(i<=nextTwo)
        {
            if(a[i] == 0){
                int temp = a[nextZero];
                a[nextZero]= a[i];
                a[i] = temp;
                i++;
                nextZero++;
            }else if (a[i] == 2){
                    int temp = a[nextTwo];
                    a[nextTwo] = a[i];
                    a[i] = temp;
                    nextTwo--;
                } 
                else{
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