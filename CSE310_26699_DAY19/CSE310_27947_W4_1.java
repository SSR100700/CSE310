import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int x,y;
        int arr[]= new int[a];
        if(a>2 && a<30){
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=1;i<a;i++){
                x=arr[i];
                y=arr[i-1];
                if(y!=x)
                    System.out.print(y+" ");
                
            }
            System.out.print(arr[a-1]);
        }
        else System.out.print("Invalid Input");
        
    }
}
