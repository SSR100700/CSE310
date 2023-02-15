import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
