import java.io.*;
import java.util.*;

public class Solution {
    public static void printAlternateColumn(int arr[][], int m, int n) {
      for(int j=0;j<n;j+=2) { // Column
        for(int i = 0;i<m;i++) { // Row
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int m = scn.nextInt();
      int n = scn.nextInt();
      
      int arr[][] = new int[m][n];
      
      for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      printAlternateColumn(arr,m,n);
    }
}
