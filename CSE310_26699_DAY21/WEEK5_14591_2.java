import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int x=s.nextInt(),y=s.nextInt();
        if(x<10 || x>1000 || y<10 || y>1000) System.out.print("Invalid Input");
        else System.out.print(x>y);
    }
}
