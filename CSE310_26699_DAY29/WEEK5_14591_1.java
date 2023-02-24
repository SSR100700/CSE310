import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=20 && a<=400){
            if(a%2==0 && a%3==0) System.out.print("True");
            else System.out.print("False");
        }
        else System.out.print("Invalid Input");
    }
}
