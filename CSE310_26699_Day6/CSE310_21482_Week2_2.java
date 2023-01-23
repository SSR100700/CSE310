import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a>=0 & a<128 & b>=0 & b<128){
           if(a << 2 == b | b<<2==a){
               System.out.print("Yes");
           }
           else
               System.out.print("No");
       }
       else
           System.out.println("Invalid");
    }
}
