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
        if(a>0 && a<=127 && b>0 && b<=127){
            int i=1;
            while(a<<i != b & i<8){
                i++;
            }
            if(i==8){
                System.out.print("No");
            }
            else{
                System.out.print("Yes");
            }
            
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
