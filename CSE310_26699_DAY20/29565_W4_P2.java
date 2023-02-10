import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int arr[] = new int[a];
        int sum=0;
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
