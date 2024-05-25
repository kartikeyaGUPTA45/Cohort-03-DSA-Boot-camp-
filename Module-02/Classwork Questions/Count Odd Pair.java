import java.io.*;
import java.util.*;

public class Solution {
    public static void printOddPairSum(int arr[], int n) {
      // (a,b) => 1st loop is for 'a' and second loop is for 'b'
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          int sum = arr[i] + arr[j];
          if (sum%2 != 0) {
            System.out.println(arr[i] + " " + arr[j]);
          }
        }
      }
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      printOddPairSum(arr,n);
    }
}
