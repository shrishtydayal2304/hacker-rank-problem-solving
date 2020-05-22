import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
       // int i=sc.nextInt();
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int rev ;

        for(int i=n-1;i>=0;i--)
       { 
        rev = arr[i]--;
        System.out.print(rev+ " ");

        }
       

    }}
