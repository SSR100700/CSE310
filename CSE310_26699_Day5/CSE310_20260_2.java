import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,m=0,flag=0;
        m = n/2;
        if(n==0||n==1){  
             System.out.println("Not Prime Number");      
             }
        else{  
             for(i=2;i<=m;i++){      
                  if(n%i==0){      
                  System.out.println("Not Prime Number");      
                  flag=1;      
                  break;      
                 }      
             }      
        if(flag==0)  { System.out.println("Prime Number"); }  
       }
    }
}
