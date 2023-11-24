//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
       ArrayList <Integer> list = new ArrayList<>();
       
       int startRow = 0;
       int endRow = matrix.length-1;
       int startCol =0;
       int endCol = matrix[0].length-1;
       
       while( startRow <= endRow && startCol <= endCol){
           
           // adding top Row 
           
           for(int i=startCol; i<= endCol; i++){
               list.add(matrix[startRow][i]);
           }
           startRow++;
           
           // adding right column;
           
           for(int i=startRow; i<=endRow; i++){
               list.add(matrix[i][endCol]);
           }
           endCol--;
           
           // adding bottom row
           if(startRow <= endRow){
           for(int i=endCol; i>=startCol; i--){
               list.add(matrix[endRow][i]);
           }}
           endRow--;
           
           
           // adding left Col
           if(startCol <= endCol){
           for(int i=endRow; i>=startRow; i--){
               list.add(matrix[i][startCol]);
           }}
            startCol++;
           
        }
        return list;
    }
}
