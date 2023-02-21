import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=7){
            int sum = 0;
            int arr[] = new int[a];
            for(int i=0;i<a;i++){
                arr[i] = sc.nextInt();
                sum = sum+arr[i];
            }
            int perc = sum/a;
            if(perc<=40) System.out.print("D");
            else if(perc >=50 && perc <=59) System.out.print("C");
            else if(perc >=60 && perc <=69) System.out.print("B");
            else if(perc >=70 && perc <=89) System.out.print("A");
            else System.out.print("A+");
        }
        else System.out.print("Invalid");
        
    }
}
