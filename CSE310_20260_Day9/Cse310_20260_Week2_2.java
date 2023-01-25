import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pno = sc.next();
        int l = pno.length();
        int f = pno.charAt(0);
        int s = pno.charAt(1);
        if(l==12){
            System.out.print("Number Saved");
        }
        else System.out.print("Enter Valid Number");
        
    }
}
