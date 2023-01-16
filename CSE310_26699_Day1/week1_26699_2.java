import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= 2*x;
        temp=x;
        x=y;
        y=temp;
        System.out.print(x+" "+y);
        //System.out.print(y);
    }
}
